public class Alumno{
	String nombre;
	int edad;
	String numCuenta;

	public Alumno(){
		nombre = "nobody";
		edad = 0;
		numCuenta ="000000000";
		System.out.println("Construyendo Alumno");
	}

	public Alumno(String nombre, int edad, String numCuenta){
		this.nombre = nombre;
		this.edad = edad;
		this.numCuenta = numCuenta;
	}

	public String toString(){
		return "Yo soy " + this.nombre + "y mi numero de cuenta es: "+numCuenta;
	}

}




