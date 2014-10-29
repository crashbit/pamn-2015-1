import java.net.*;
import java.io.*;

public class SocketClient{
	
	public static void main(String args[]){
		String cadena;

		try{

		Socket cliente = new Socket("cursos.pamn.net", 80);

		InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
		BufferedReader entrada = new BufferedReader(isr);

		PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

		System.out.println("Servidor conectado.");

		salida.println("get index.html");
		while((cadena = entrada.readLine())!=null)
			System.out.println(cadena);





		}catch(UnknownHostException e){
			System.out.println("No se encuentra el servidor");
		}catch(IOException e){
			System.out.println(e);
		}

					

	}
}