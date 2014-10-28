import java.net.*;
import java.io.*;
import java.util.*;

// Declaramos la clase 
public class SocketClient{
	
	public static void main(String args[]){

		// Creamos un par de variables:
		// Una manejara el servidor
		// Una manejara el puerto al cuál nos conectaremos
		String servidor = "www.unam.mx";
		int puerto = 80;

		String cadena;

		try{

			//Creamos una conexión al puerto de 'echo', puerto no. 13
			Socket socket = new Socket(servidor, puerto);
			System.out.println("Conectado al servidor");

			// Creamos una conexión al stream de entrada y salida, este ejercicio es similar al ejercicio
			// de lectura de teclado
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader entrada = new BufferedReader(isr);

			// Mandamos una cadena al servidor
			
			salida.println("get index.html");

			// Leemos ahora del socket que se ha conectado 1 linea
			entrada.readLine();
			
			cadena = entrada.readLine();

			// Imprimimos en pantalla lo que el servidor devuelve
			
			System.out.println("El servidor contesto: " + cadena);

			// Cerramos el socket
			
			socket.close();

			// Atrapamos una Exception por si el servidor no se conoce
		} catch( UnknownHostException e){
			System.out.println("No se encuentra el servidor");			
			
			// Atrapamos una Exception por si no podemos leer o enviar al servidor
		} catch(IOException e){
			System.out.println(e);
		}

	}
}