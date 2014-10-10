public class Prog17{
	
	public static void main(String args[]){

		try{
			System.out.println(args[1]);
		}catch(ArrayIndexOutOfBoundsException cualquiervar){
			System.out.println("Se requieren 2 parametros mínimo :P");
		}

	}

}