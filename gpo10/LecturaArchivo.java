import java.io.*;
import java.util.*;
// Scanner

public class LecturaArchivo{
	
	public static void main(String args[])throws IOException{

		FileReader archivo  = new FileReader("gpo10.txt");
		BufferedReader entrada;
		String cadena;
		entrada = new BufferedReader(archivo);
		Scanner lector = new Scanner(new File("gpo10.txt"));


		System.out.println("Leyendo 1 linea del archivo ");
		while(cadena != null){
			cadena = entrada.readLine();
			cadena = lector.nextLine();
			System.out.println(cadena);			
		}



		archivo.close();

	}

}






