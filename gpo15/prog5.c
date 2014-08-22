#include <stdio.h>

int main(){
	
	FILE *archivo;
	char caracter;

	archivo = fopen("numeros.txt", "r");

	if(archivo == NULL){
		printf("El archivo no se encuentra :( ");
		return 0;
	}

	while(caracter != EOF){
		caracter = fgetc(archivo);
		printf("%c", caracter);

	}

	return 0;
}