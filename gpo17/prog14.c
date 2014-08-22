#include <stdio.h>

int main(){
	
	FILE *archivo;
	int edad=22;

	archivo = fopen("alumnos.txt", "w");

	if(archivo == NULL){
		printf("No se encuentra el archivo...");
		return 0;
	}

	fprintf(archivo, "Juan tiene %d años ", edad);

	fclose(archivo);
	return 0;
}
