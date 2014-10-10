import java.util.Scanner;

public class Prog19{
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Indique su saldo: ");
		int saldo = teclado.nextInt();
		try{
			
		if(saldo < 100)
			throw new CuentaException("Se requiere de mas dinero");
		}catch(CuentaException e){
			System.out.println(e.getMessage());
			System.out.println("Vuelva con mas dinero... :)");
		}finally{
			System.out.println("Eso es to, eso es to, to do amigos");
		}

	}
}