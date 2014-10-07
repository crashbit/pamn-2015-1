// Exception y error

public class Prog2{
	
	public static void main(String args[]){

		try{
			
			int x = 1/1;
			System.out.println(args[3]);
			System.out.println(x);

		}catch(ArithmeticException e){
			System.out.println("Estimado usuario, hay un error.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error en el indice del arreglo.");
		}

		finally{
			System.out.println("Bloque finally.");

		}

	}

}