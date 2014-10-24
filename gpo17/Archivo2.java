import java.util.*;
import java.io.*;

public class Archivo2{
	
	public static void main(String args[]){
		String nomArchivo = "salida.txt";
		Scanner entrada = null;

		try{
			File archivito = new File(nomArchivo);
			entrada = new Scanner(archivito);
			System.out.println(archivito.length());

		}catch(FileNotFoundException e){
			System.out.println("No se encuentra el archivo");
		}

		while(entrada.hasNextLine()){
			System.out.println(entrada.nextLine());
		}

		entrada.close();


	}	
}