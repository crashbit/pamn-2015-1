public class Prueba{
	
	public static void main(String args[]){

		Alumno juan = new Alumno();

		juan.id = 1;
		juan.nombre = "Juan";
		juan.carrera = "Ing. en Computación";

		System.out.println("Yo me llamo " + juan.nombre);
		juan.leer();

	}
}