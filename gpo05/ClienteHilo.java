import java.net.*;
import java.io.*;
import java.util.*;

public class ClienteHilo extends Thread{
	private InputStreamReader isr = null;
	private BufferedReader entrada = null;
	private PrintWriter salida = null;
	private Socket clienteSocket = null;
	private ClienteHilo hilos[];
	private int maxClientes;
	private int numUsuario;

	public ClienteHilo(Socket socket, ClienteHilo[] hilos, int n){
		this.clienteSocket = socket;
		this.hilos = hilos;
		this.maxClientes = hilos.length;
		this.numUsuario = n;

	}

	public void run(){
		String nombre;
		int i;
		int totalUsuarios = this.maxClientes;
		int numUsuario = this.numUsuario;
		try{
		isr = new InputStreamReader(clienteSocket.getInputStream());
		entrada = new BufferedReader(isr);
		salida = new PrintWriter(clienteSocket.getOutputStream(), true);

		salida.println("Bienvenido usuario no. " + numUsuario + "\n");
		salida.println("Su nombre?\n");

		nombre = entrada.readLine();
		for(i = 0; i< totalUsuarios; i++){
			if(hilos[i] != null && hilos[i] != this)
				hilos[i].salida.println("Acaba de entrar " + nombre);
		}

		while(true){
			
		}

			
		}catch(Exception e){

		}
	}

}