public class Test2{
	
	public static void main(String args[]){
		
		Alumno fabiola = new Alumno();
		Alumno david = new Alumno("David", 30, "310077680");

		System.out.println(fabiola.nombre);
		fabiola.nombre = "Fabiola";
		System.out.println(fabiola.nombre);
		System.out.println(david.nombre);
		System.out.println(david + "\n" + fabiola);
		
	}
}