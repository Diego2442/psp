package psploc;

public class NumeroLineasFuncionales {
	
	public int numeroMetodos;
    public int numeroAtributos;

    
    public NumeroLineasFuncionales(int numeroMetodos, int numeroAtributos){
        this.numeroMetodos = numeroMetodos;
        this.numeroAtributos = numeroAtributos;
    }

    //Metodo que cuenta las lineas Funcionales 
    public int contarLineasFuncionales(int numeroMetodos, int numeroAtributos){
        int numeroCodigoFuncional = (numeroMetodos + numeroAtributos);
      //se imprime numero de lineas funcionales totales
        System.out.println("Numero TOTAL de lineas Funcionales: " + numeroCodigoFuncional);
        //Retornamos un int
        return numeroCodigoFuncional;
    }

}
