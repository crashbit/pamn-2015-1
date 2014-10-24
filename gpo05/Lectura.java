import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura{

	public static void main(String args[]) throws FileNotFoundException{

		File archivo = new File("Hola.txt");
		Scanner entrada = new Scanner(archivo);

		System.out.println(archivo.length());

	}
}