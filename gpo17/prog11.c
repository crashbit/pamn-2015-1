#include <stdio.h>

int main(){
	
	FILE *archivo;

	archivo = fopen("alumnos.txt", "r+w");

	if(archivo == NULL){
		printf("No se encuentra el archivo...");
		return 0;
	}


	fputc('-', archivo);
	fputc('-', archivo);
	while(!feof(archivo)){

		printf("%c", fgetc(archivo));
		fputc('.', archivo);
	}

	fputc('-', archivo);
	fputc('-', archivo);

	fclose(archivo);
	return 0;
}
