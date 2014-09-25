public class test{
	
	public static void main(String args[]){

		Alumno carlos = new Alumno();
		Alumno pancho = new Alumno();
		Alumno diana = new Alumno("311062805", 18);
		carlos.numCuenta = "090929142";

		System.out.println(carlos.numCuenta + " " + carlos.edad);
		System.out.println(pancho.numCuenta + " " + pancho.edad);
		System.out.println(diana.getNumCuenta() + " " + diana.getEdad());
		System.out.println(diana);

	}

}