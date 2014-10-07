public class Ingeniero extends Alumno{
	String nombre;

	public Ingeniero(){
		super("nada", 0, "00000000");
		super.nombre = "todo, todo , todo ";
	}

	void estudia(){
		System.out.println("Ingeniero poderoso estudiando");
	}

}