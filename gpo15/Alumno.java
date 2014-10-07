public class Alumno{
	// Declarando propiedades
	static int numAlumnos = 0;
	int id = 1;
	private String nombre;
	String carrera;

	// Declarando constructor

	public Alumno(){
		System.out.println("Construyendo 1 alumno");
		numAlumnos = numAlumnos +1;
		id = numAlumnos;
		nombre = "Don nadie";
		carrera = "no hago nada";
	}

	public Alumno(String nombre, String carrera){
		numAlumnos = numAlumnos +1;
		id = numAlumnos;
		this.nombre = nombre;
		this.carrera = carrera;

	}

	// Declarando metodos
	void leer(){
		System.out.println("Alumno leyendo");
	}

	// Sobrecarga de metodos heredados

	public String toString(){
		String cadena;
		cadena = " Yo me llamo " + this.nombre;
		cadena = cadena + " y estudio: " + this.carrera;
		cadena = cadena + " y mi id es: " + this.id;

		return cadena;
	}

	// Setters y Getters
	
	String getNombre(){
		return this.nombre;
	}

	void setNombre(String nombre){
		this.nombre = nombre;
	}

}






