public class Empleado{

	static int numEmpleado = 0;
	int id ;
 	private String nombre;
	private String puesto;

	public Empleado(){
		numEmpleado = numEmpleado +1;
		id = numEmpleado;
		this.nombre = "don Nadie";
		this.puesto = " gerente de la banca";
	}

	public Empleado(String nombre, String puesto){
		numEmpleado = numEmpleado +1;
		id = numEmpleado;
		this.nombre = nombre;
		this.puesto = puesto;	
	}

	public String toString(){
		String cadena = "Tengo el id: " + this.id;
		cadena = cadena + " y me llamo:" + this.nombre;
		cadena = cadena + " además trabajo como: " + this.puesto;
		return cadena;
	}

	// Setters and Getters
	String getNombre(){
		return this.nombre;
	}

	void setNombre(String nombre){
		this.nombre = nombre;
	}

	String getPuesto(){
		return this.puesto;
	}

	void setPuesto(String puesto){
		this.puesto = puesto;
	}


}