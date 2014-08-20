#include <stdio.h>

int main(){
		
	FILE *archivo;
	int i=0;

	archivo = fopen("chars.c", "w");

	while(i<3){
		fputc('a', archivo);
		i++;
	}
	fclose(archivo);
	return 0;
}