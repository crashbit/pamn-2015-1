#include <stdio.h>

int main(){
	
	FILE *archivo;

	char numero[6] = {"-17000"}

	archivo = fopen("alumnos.txt", "w");

	if(archivo == NULL){
		printf("No se encuentra el archivo...");
		return 0;
	}

	fputs("Brayan", archivo);
	fputs("Disney", archivo);
	fputs("Onecent", archivo);


	fclose(archivo);
	return 0;
}
