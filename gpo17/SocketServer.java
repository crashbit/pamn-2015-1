import java.net.*;
import java.io.*;
import java.util.*;

public class SocketServer{

	public static void main(String args[]) throws IOException{

		Socket cliente;
		ServerSocket servidor = new ServerSocket(8000);
		String cadena, cadena2;

		cliente = servidor.accept();
		Scanner teclado = new Scanner(System.in);

		InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
		BufferedReader entrada = new BufferedReader(isr);
		PrintWriter salida = new PrintWriter(cliente.getOutputStream(),true);
		salida.println("Bienvenido");
		System.out.println(entrada.readLine());


		while(true){
			cadena2 = teclado.nextLine();
			salida.println("Servidor dice:" + cadena2);
			cadena = entrada.readLine();
			System.out.println("Cliente dice: " + cadena);
		}




	}
}