#include <stdio.h>

int main(){
	
	FILE *archivo;
	float promedio = 7.56;
	

	archivo = fopen("numeros.txt", "a");

	fprintf(archivo, "El promedio de mi amigo es: %f", promedio);

	fclose(archivo);
	return 0;
}