public class Prog20{
	
	public static void main(String args[]){

		try{
			System.out.println(1/0);
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException loquesea){
			System.out.println("Falta un parametro :)");
		}catch(ArithmeticException otravar){
			System.out.println("Error al dividir");
		}


	}
}