#include <stdio.h>

int main(){
	
	FILE *archivo;
	char letras[5];

	archivo = fopen("alumnos.txt", "r");

	if(archivo == NULL){
		printf("No se encuentra el archivo...");
		return 0;
	}



	while(!feof(archivo)){
		fgets(letras, 5, archivo);
		printf("%s", letras);
	}

	fclose(archivo);
	return 0;
}
