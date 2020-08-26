package psploc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumeroLineasVacias {
	
	public String archivo;

    
    public NumeroLineasVacias(String archivo){
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta las lineas Vacias
    public int contarLineasVacias(String archivo){
        int numeroLineasVacias = 0;

        //errores con Try-Catch
        try {

            BufferedReader archivoCargado = new BufferedReader(new FileReader(archivo));

            String leerLinea = archivoCargado.readLine();

            while(leerLinea != null){
                if(leerLinea.isEmpty()){
                    numeroLineasVacias++;
                }
                leerLinea = archivoCargado.readLine();
            }
          //se imprime numero de lineas vacias
            System.out.println("Numero TOTAL de Lineas Vacias: " + numeroLineasVacias);
            archivoCargado.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retornamos un int
        return numeroLineasVacias;
    }

}
