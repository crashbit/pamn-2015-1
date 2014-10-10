import java.util.Scanner;

public class Prog21{
	
	public static void main(String args[])throws Exception{
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuantas donas quiere? ");
		int numDonas = teclado.nextInt();

		System.out.println("¿Cuantos vasos de café quiere? ");
		int numVasos = teclado.nextInt();

		if(numVasos < 1)
			throw new Exception("No ha pedido café, se lo damos bara...");		
		
	}
}