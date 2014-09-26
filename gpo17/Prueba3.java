public class Prueba3{
	
	public static void main(String args[]){

		Empleado godinez = new Empleado();
		Empleado otroGodinez = new Empleado("Pedro", "Capturista");
		Empleado pancho = new Empleado("Pancho", "Gerente de producto");
		

		System.out.println(godinez);
		System.out.println(otroGodinez);
		System.out.println(pancho);

		godinez.capturaTextos();	
	}

}