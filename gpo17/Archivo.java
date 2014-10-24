import java.util.*;
import java.io.*;

public class Archivo{
	
	public static void main(String args[]) throws FileNotFoundException{
		PrintWriter salida = null;

		salida = new PrintWriter("salida.txt");
		salida.println("Hola mundo");
		salida.close();


	}	
}