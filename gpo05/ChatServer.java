import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer{

	static ClienteHilo socketCliente[] = new ClienteHilo[10];
	static Socket cliente;

	public static void main(String args[]) throws Exception{
		int i = 0;
		ServerSocket serversocket = new ServerSocket(9000);
		System.out.println("Servidor listo");

		while(i<10){

			cliente = serversocket.accept();
			ClienteHilo ch = new ClienteHilo(cliente, socketCliente,i);
			socketCliente[i] = ch;
			ch.start();
			i++;

		}
		
	}
}