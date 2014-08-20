#include <stdio.h>

int main(){
		
	FILE *archivo;
	int numero = 20;
	archivo = fopen("chars.c", "w");

	fprintf(archivo, "Hola me llamo luis y tengo %d annos", numero);

	fclose(archivo);
	return 0;
}