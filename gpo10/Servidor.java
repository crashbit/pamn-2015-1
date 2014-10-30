import java.net.*;
import java.io.*;
import java.util.*;

public class Servidor{

	public static void main(String args[])throws UnknownHostException, IOException{
		Scanner teclado = new Scanner(System.in);

		ServerSocket servidor = new ServerSocket(9000);
		Socket cliente;

		System.out.println("Servidor Listo");

		cliente = servidor.accept();

		System.out.println("Cliente conectado");

		InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
		BufferedReader entrada = new BufferedReader(isr);

		PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

		salida.println("Bienvenido Sr. Don Usuario :)");
		String cadena, cadena2;

		while(true){
			cadena = entrada.readLine();
			System.out.println("El usuario dijo:" + cadena + "\n");

			cadena2 = teclado.nextLine();
			salida.println("Servidor: " + cadena2);

		}
	}
}




