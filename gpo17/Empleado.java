public class Empleado{
	//Declarando propiedades
	static int totalEmpleados =0;
	int id = 1;
	String nombre;
	String puesto;

	//Declarando constructores
	public Empleado(){
		totalEmpleados = totalEmpleados +1;
		id = totalEmpleados;
		this.nombre= "nobody";
		this.puesto = "none";
	}

	public Empleado(String nombre, String puesto){
		totalEmpleados = totalEmpleados +1;
		this.id = totalEmpleados;
		this.nombre = nombre;
		this.puesto = puesto;
	}

	//Declarando métodos
	void capturaTextos(){
		System.out.println("... Godinez Capturando textos...");
	}

	//Sobrecargar metodos heredados
	public String toString(){
		String cadena;
		cadena = "Yo soy el empleado no. " + this.id;
		cadena = cadena + " y me llamo " + this.nombre;
		cadena = cadena + " y trabajo como " + this.puesto;

		return cadena;
	}

}