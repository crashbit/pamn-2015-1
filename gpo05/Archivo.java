import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo{

	public static void main(String args[]){

		String nombre = "Hola.txt";
		PrintWriter salida = null;

		try{
			salida = new PrintWriter(nombre);
		}catch(FileNotFoundException e){

			System.out.println("Error al abrir el archivo");
			System.exit(0);
		}

		salida.println("Hola mundo");
		salida.close();

	}

}