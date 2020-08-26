package psploc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumeroAtributos {
	
	public String archivo;

    
    public NumeroAtributos(String archivo){
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta los Atributos en el archivo
    public int contarAtributosTotales(String archivo){
        int numeroAtributos = 0;

        //se utilza Try-Catch
        try {
            BufferedReader archivoCargado = new BufferedReader(new FileReader(archivo));

            String leerLinea = archivoCargado.readLine();

            while(leerLinea != null) {
                if ((leerLinea.trim().contains("public")||leerLinea.trim().contains("private")) && leerLinea.trim().contains(";")) {
                    numeroAtributos++;
                }
                leerLinea = archivoCargado.readLine();
            }
          //se imprime numero de atributos
            System.out.println("Numero TOTAL de Atributos: " + numeroAtributos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Return un int
        return numeroAtributos;
    }

}
