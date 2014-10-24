import java.io.*;

public class Archivo{
	
	String nombre;
	File arch;

	void muestraInfo(String nombre){

		arch = new File(nombre);
		if(arch.exists()){
			System.out.println(arch.getName());
			System.out.println(arch.getAbsolutePath());
			System.out.println(arch.length() + " bytes");
			System.out.println(arch.lastModified() + " ultima modificacion");
			if(arch.isFile())
				System.out.println("Es un archivo normal");
			else if(arch.isDirectory()){
				System.out.println("Es un directorio");
				mostrarDirectorio(arch);
			}
		}

		else
			System.out.println("No existe el archivo...");	
	}

	void mostrarDirectorio(File directorio){

		String archivos[]  = directorio.list();
		for(int i = 0; i < archivos.length; i++){
			System.out.println("\t" + archivos[i]);
		}

	}


}






