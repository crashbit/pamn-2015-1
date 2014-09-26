public class Prueba3{
	
	public static void main(String args[]){

		Alumno juan = new Alumno();
		Alumno isais = new Alumno("isais", "Ing. Computacion");
		Alumno petra = new Alumno("Petra", "Ing. Civil");


		System.out.println("Yo me llamo " + juan.nombre + " y mi id es: " + juan.id);
		System.out.println("Yo me llamo " + isais.nombre + " y mi id es: " + isais.id);
		System.out.println("Yo me llamo " + petra.nombre + " y mi id es: " + petra.id);


	}
}