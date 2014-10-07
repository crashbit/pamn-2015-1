public class Prog24{
	

	public static void main(String args[]){

		try{	
			int x = 1/1;
			//System.out.println(args[3]);
		}catch(ArithmeticException laquesea){
			System.out.println("Error mi chavo... :D");
		}catch(ArrayIndexOutOfBoundsException iguallaquesea){
			System.out.println("Error en el indice del array");
		}finally{
			System.out.println("Bloque Finally ejecutado ");
		}

	}

}