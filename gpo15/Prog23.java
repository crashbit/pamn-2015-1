import java.util.Scanner;

public class Prog23{
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuantas donas quiere? ");
		int numDonas = teclado.nextInt();

		System.out.println("¿Cuantos vasos de café quiere? ");
		int numVasos = teclado.nextInt();

		try{
			if(numVasos < 1)
				throw new Exception("No ha pedido café, se lo damos bara...");	
			if(numVasos > 5)
				throw new VasosException("Son muchos vasos, enfermará y morirá... :'(");	

		}catch(VasosException e){
			System.out.println(e.getMessage());
			System.out.println("No le podemos vender tantos vasos");
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Le ponemos nombre a su vaso ¡gratis!");
		}finally{
			System.out.println("¡Gracias por visitar Cafeteria el Objeto!");
		}
	}
}