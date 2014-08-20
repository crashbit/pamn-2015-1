// Lee de un archivo usando fgetc
#include <stdio.h>

int main(){
	
	FILE *fp;

	fp = fopen("hola.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo :P ");
		return 0;
	}

	while(!feof(fp)){
		printf("%c", fgetc(fp));
	}

	printf("\n\n");

	fclose(fp);

	return 0;
}