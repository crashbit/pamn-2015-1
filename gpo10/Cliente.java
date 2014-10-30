import java.net.*;
import java.io.*;
import java.util.*;
public class Cliente{
	
	public static void main(String args[])throws UnknownHostException, IOException{
		Scanner teclado = new Scanner(System.in);

		Socket cliente = new Socket("localhost", 9000);
		System.out.println("Cliente conectado");

		InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
		BufferedReader entrada = new BufferedReader(isr);

		PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

		//salida.println("get index.html");

		System.out.println(entrada.readLine());

		String cadena, cadena2;

		while(true){
			cadena2 = teclado.nextLine();
			salida.println("Usted escribio: " + cadena2);

			cadena2 = entrada.readLine();
			salida.println("Servidor: " + cadena2);

		}

	}
}





