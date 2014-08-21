#include <stdio.h>

int main(){

	FILE *fp;
	char c;

	fp = fopen("numeros.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo, :( ");
		return 0;
	}
	
	while(!feof(fp)){
		c = fgetc(fp);
		printf("%c", c);
	}

	fclose(fp); 

	printf("\n\n");
	return 0;
}











