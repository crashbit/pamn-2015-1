public class Prueba2{
	
	public static void main(String args[]){

		Alumno juan = new Alumno();
		Alumno isais = new Alumno();
		Alumno petra = new Alumno();

		juan.nombre = "Juan";
		juan.carrera = "Ing. en Computación";

		isais.nombre = "Isais";
		isais.carrera = "Ing. en Computación";

		System.out.println("Yo me llamo " + juan.nombre + " y mi id es: " + juan.id);
		System.out.println("Yo me llamo " + isais.nombre + " y mi id es: " + isais.id);
		System.out.println("Yo me llamo " + petra.nombre + " y mi id es: " + petra.id);


	}
}