import java.util.Scanner;

public class Prog18{
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Indique el número de donas: ");
		int totalDonas = teclado.nextInt();

		System.out.println("Indique el número de vasos de cafe: ");
		int totalVasos = teclado.nextInt();

		try{
			if(totalVasos < 1){
					throw new Exception("No pidio cafe..."); 
			}

			if(totalVasos > 5){
					throw new ArithmeticException("Exceso permitido por la ley");
			}
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("Solo le podemos vender 3");		
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Pida algo para tomar, ¡Gracias!");
		}
	}
}






