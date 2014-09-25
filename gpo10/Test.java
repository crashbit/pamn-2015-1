public class Test{
	
	public static void main(String args[]){
		
		Alumno fabiola = new Alumno();

		fabiola.nombre = "Fabiola";
		fabiola.edad = 18;
		fabiola.numCuenta = "311306899";

		System.out.println("Hola " + fabiola.nombre + " " + fabiola.edad);
	}
}