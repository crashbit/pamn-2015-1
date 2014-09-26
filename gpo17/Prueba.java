public class Prueba{
	
	public static void main(String args[]){

		Empleado godinez = new Empleado();
		Empleado otroGodinez = new Empleado();
		Empleado pancho = new Empleado();
		godinez.nombre = "Pedro";
		godinez.puesto = "Encargado del departamento de Ingenieria de Captura de Datos";

		System.out.println("Soy el empleado: " + godinez.id);
		System.out.println("Soy el empleado: " + otroGodinez.id);
		System.out.println("Soy el empleado: " + pancho.id);
		godinez.capturaTextos();	
	}

}