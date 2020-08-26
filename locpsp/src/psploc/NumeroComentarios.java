package psploc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumeroComentarios {
	
	public String archivo;

   
    public NumeroComentarios(String archivo){
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta los Comentarios 
    public int contarComentariosTotales(String archivo){
        int numeroComentarios = 0;

        //Se maneja Try-Catch
        try {
            BufferedReader cargarArchivo = new BufferedReader(new FileReader(archivo));

            String leerLinea = cargarArchivo.readLine();

            while(leerLinea != null) {
                if(leerLinea.contains("/") || leerLinea.contains("*")){
                    numeroComentarios++;
                }
                leerLinea = cargarArchivo.readLine();
            }
          //se imprime numero de comentarios
            System.out.println("Numero TOTAL de comentarios: " + numeroComentarios);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retornamos un int
        return numeroComentarios;
    }

}
