#include <stdio.h>

int main(){
		
	FILE *archivo;
	int numero = 20;
	archivo = fopen("chars.c", "w");

	fprintf(archivo, "Hola me llamo luis y tengo %d a%cos", numero,164);

	fclose(archivo);
	return 0;
}
