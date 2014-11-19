import java.io.*;
import java.net.*;

public class ChatClient{

	public static void main(String args[]) throws UnknownHostException, IOException{

		Socket cliente = null;
		PrintWriter salida;
		InputStreamReader isr, isr2;
		BufferedReader entrada, teclado;


		cliente = new Socket("localhost", 9000);
		salida = new PrintWriter(cliente.getOutputStream(), true);
		isr = new InputStreamReader(cliente.getInputStream());
		entrada = new BufferedReader(isr);
		isr2 = new InputStreamReader(System.in);
		teclado = new BufferedReader(isr2);
		String respuesta;

		if(cliente != null && salida != null && entrada != null){
			salida.println(teclado.readLine());
			while((respuesta = entrada.readLine())!=null){
				System.out.println(respuesta);
				if(respuesta.indexOf("Ok") != -1)
					break;

				salida.println(teclado.readLine());
			}
			salida.close();
			entrada.close();
		}



	}
}