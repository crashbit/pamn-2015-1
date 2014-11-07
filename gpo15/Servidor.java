import java.net.*;
import java.io.*;


public class Servidor{

	public static void main(String args[]) throws UnknownHostException, IOException{

		String cadena;
		Socket cliente;
		ServerSocket servidor = new ServerSocket(8080);
		System.out.println("Servidor listo :)");

		cliente = servidor.accept();
		InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
		BufferedReader entrada = new BufferedReader(isr);

		PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);	

		salida.println("Bienvenido godinez");
		cadena = entrada.readLine();
		System.out.println("El godinez escribio: " + cadena);
		salida.println("Tu godinez escribiste: " + cadena);


	}
}



