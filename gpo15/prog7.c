#include <stdio.h>

int main(){
	
	FILE *archivo;
	char letras[5];
	

	archivo = fopen("numeros.txt", "r");

	while(!feof(archivo)){
		fgets(letras, 5, archivo);
		printf("%s\n", letras);
	}

	fclose(archivo);
	return 0;
}