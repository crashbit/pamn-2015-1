#include <stdio.h>

int main(){
	
	FILE *archivo;
	int numero, total=0;

	archivo = fopen("numeros.txt", "r");

	if(archivo == NULL){
		printf("No se encuentra el archivo...");
		return 0;
	}

	while(!feof(archivo)){
		fscanf(archivo, "%d,", &numero);
		total = total + numero;
		numero = 0;
	}

	printf("El resultado es: %d", total);

	fclose(archivo);
	return 0;
}
