#include <stdio.h>

int main(){
	
	FILE *archivo;
	

	archivo = fopen("numeros.txt", "a");

	fputc('z', archivo);
	fputc('z', archivo);
	fputc('z', archivo);

	fclose(archivo);
	return 0;
}