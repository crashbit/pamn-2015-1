public class Prueba2{
	
	public static void main(String args[]){

		Empleado godinez = new Empleado();
		Empleado otroGodinez = new Empleado("Pedro", "Capturista");
		Empleado pancho = new Empleado("Pancho", "Gerente de producto");
		

		System.out.println("Soy el empleado: " + godinez.id +" y me llamo "+ godinez.nombre);
		System.out.println("Soy el empleado: " + otroGodinez.id +" y me llamo "+ otroGodinez.nombre);
		System.out.println("Soy el empleado: " + pancho.id +" y me llamo "+ pancho.nombre);
		
		System.out.println(godinez);

		godinez.capturaTextos();	
	}

}