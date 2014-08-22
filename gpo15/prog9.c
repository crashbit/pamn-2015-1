#include <stdio.h>

int main(){
	
	FILE *archivo;
	int numero;
	int total = 0;

	archivo = fopen("numeros.txt", "r");

	while(!feof(archivo)){
		fscanf(archivo, "%d,", &numero);
		total = total + numero;
		numero = 0;
	}

	printf("El total es: %d", total);


	fclose(archivo);
	return 0;
}