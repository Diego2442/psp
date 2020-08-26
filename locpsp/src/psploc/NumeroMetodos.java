package psploc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumeroMetodos {
	
	public String archivo;

    
    public NumeroMetodos(String archivo){
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta la cantidad de Metodos 
    public int contarMetodosTotales(String archivo){ 
        int numeroMetodos = 0;

        //errores con Try-Catch
        try {
            BufferedReader archivoCargado = new BufferedReader(new FileReader(archivo));

            String leerLinea = archivoCargado.readLine();

            while(leerLinea != null) {
                if((leerLinea.contains("public") || leerLinea.contains("private") || leerLinea.contains("protected"))
                    && leerLinea.contains("(") && leerLinea.contains(")")){
                        numeroMetodos++;
                }
                leerLinea = archivoCargado.readLine();
            }
            
            //se imprime numero de metodos
            System.out.println("Numero TOTAL de Metodos: " + numeroMetodos);
            archivoCargado.close();          
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retornamos un int
        return numeroMetodos;

    } 

}
