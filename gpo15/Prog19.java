public class Prog19{
	
	public static void main(String args[]){

		Alumno alumnos[] = new Alumno[4];

		alumnos[0] = new Alumno();
		alumnos[1] = new Ingeniero();
		alumnos[2] = new Contador();
		alumnos[3] = new Ingeniero();

		for(int i=0; i<alumnos.length; i++){
			alumnos[i].leer();
		}

	}
}