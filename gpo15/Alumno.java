public class Alumno{
	// Declarando propiedades
	static int numAlumnos = 0;
	int id = 1;
	String nombre;
	String carrera;

	// Declarando constructor

	public Alumno(){
		System.out.println("Construyendo al alumno");
		numAlumnos = numAlumnos +1;
		id = numAlumnos;
	}

	// Declarando metodos
	void leer(){
		System.out.println("Alumno leyendo");
	}
}