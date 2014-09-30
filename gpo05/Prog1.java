public class Prog1{
	
	public static void main(String args[]){

		Empleado godinez = new Empleado();
		Empleado santos = new Empleado();
		Empleado perez = new Empleado("Lalo Pérez", "Gerente del departamento de Ingeniería de Captura de Información Estratégica");
		Gerencia gomez = new Gerencia();

		System.out.println(godinez);
		System.out.println(santos);
		System.out.println(perez);
		System.out.println(gomez);

	}


}