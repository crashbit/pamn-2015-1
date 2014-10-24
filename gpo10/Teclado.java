import java.io.*;
import java.util.*;
// Scanner

public class Teclado{
	
	public static void main(String args[])throws IOException{

		InputStreamReader lector;
		BufferedReader entrada;
		Scanner test = new Scanner(System.in);

		lector = new InputStreamReader(System.in); 
		entrada = new BufferedReader(lector);

		System.out.println("Escriba algo por favor... ");
		String cadena = entrada.readLine();
		System.out.println("Usted tecleo... " + cadena);

	}

}