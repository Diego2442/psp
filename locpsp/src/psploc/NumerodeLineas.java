package psploc;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class NumerodeLineas {
	
	public String archivo;

    
    public NumerodeLineas(String archivo) {
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta las lineas Totales
    public int contarLineasTotales(String archivo){
        
            int contadorNumeroLineas = 0;

            //Se manejan los errores con Try-Catch
            try {
                FileReader leerArchivo = new FileReader(archivo);
                LineNumberReader numeroLineas = new LineNumberReader(leerArchivo);

                    while (numeroLineas.readLine() != null) {
                        contadorNumeroLineas++;
                    }
                  //se imprime numero de lineas totales
                    System.out.println("Numero TOTAL de lineas: " + contadorNumeroLineas);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            //Retornamos un int
            return contadorNumeroLineas;
    }

}
