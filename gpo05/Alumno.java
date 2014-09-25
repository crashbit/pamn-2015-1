public class Alumno{
	String numCuenta;
	int edad;

	public Alumno(){
		System.out.println("Construyendo un alumno :P");
		this.numCuenta = "000000000";
		this.edad = 0;
	}

	public Alumno(String numCuenta, int edad){
		this.numCuenta = numCuenta;
		this.edad = edad;
	}

	String getNumCuenta(){
		return this.numCuenta;
	}

	int getEdad(){
		return this.edad;
	}

	public String toString(){
			return "Soy un alumno y " + this.numCuenta + " y " + this.edad;
	}
}