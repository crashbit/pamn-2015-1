import java.net.*;
import java.io.*;


public class Cliente{

	public static void main(String args[]) throws UnknownHostException, IOException{

		String cadena;
		Socket conecta = new Socket("localhost", 8080);

		InputStreamReader isr = new InputStreamReader(conecta.getInputStream());
		BufferedReader entrada = new BufferedReader(isr);

		PrintWriter salida = new PrintWriter(conecta.getOutputStream(), true);

		salida.println("get index.html");
		
		while((cadena = entrada.readLine())!=null)
			System.out.println(cadena);

	}
}



