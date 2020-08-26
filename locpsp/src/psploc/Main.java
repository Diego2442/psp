package psploc;

//@author Diego Andres Tovar (curso-psp)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import psploc.NumeroAtributos;
import psploc.NumeroComentarios;
import psploc.NumeroLineasFuncionales;
import psploc.NumerodeLineas;
import psploc.NumeroLineasVacias;
import psploc.NumeroMetodos;
import psploc.conexionDB;

public class Main {
	
public static void main(String[] args) throws SQLException {
        
        //Archivo que a leer
        String archivo = "C://Users/Maga/Documentos/Ejemplo.java";
        
        //Se crean las instancias de las clases
        NumerodeLineas conteo1 = new NumerodeLineas(archivo);

        NumeroAtributos conteo2 = new NumeroAtributos(archivo);

        NumeroMetodos conteo3 = new NumeroMetodos(archivo);

        NumeroLineasVacias conteo4 = new NumeroLineasVacias(archivo);

        NumeroComentarios conteo5 = new NumeroComentarios(archivo);

        NumeroLineasFuncionales conteo6 = new NumeroLineasFuncionales(22, 21);


        //Se maneja la coneccion a base de datos
        conexionDB baseDato = new conexionDB();
        Connection conn = baseDato.conectar();
        
        String sqlInsert = "insert into datos (metodos, atributos, comentarios, lineas_vacias, ";
        sqlInsert += "lineas_funcionales, lineas_totales) values(?,?,?,?,?,?)";
        
        PreparedStatement statement = conn.prepareStatement(sqlInsert);
        statement.setInt(1, conteo3.contarMetodosTotales(archivo));
        statement.setInt(2, conteo2.contarAtributosTotales(archivo));
        statement.setInt(3, conteo5.contarComentariosTotales(archivo));
        statement.setInt(4, conteo4.contarLineasVacias(archivo));
        statement.setInt(5, conteo6.contarLineasFuncionales(22, 21));
        statement.setInt(6, conteo1.contarLineasTotales(archivo));
        
        statement.executeUpdate();
        
	}

}
