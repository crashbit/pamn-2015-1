#include <stdio.h>

int main(){
		
	FILE *archivo;
	int numero;
	int total =0;
	archivo = fopen("numeros.txt", "r");

	while(!feof(archivo)){
		fscanf(archivo,"%d,", &numero);
		total = total + numero;
		numero = 0;
	}

	printf("\t\t\t%d\n\n", total);

	fclose(archivo);
	return 0;
}