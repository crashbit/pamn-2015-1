public class Alumno{
	// Declarando propiedades
	static int numAlumnos = 0;
	int id = 1;
	String nombre;
	String carrera;

	// Declarando constructor

	public Alumno(){
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
}