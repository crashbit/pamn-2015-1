// guarda en un archivo usando fputc
#include <stdio.h>

int main(){
	
	FILE *fp;

	fp = fopen("holasss.txt", "w");
	int i=0;

	if(fp == NULL){
		printf("No existe el archivo :P ");
		return 0;
	}

	while(i< 3){
		fputc('a', fp);
		i++;
	}

	printf("\n\n");

	fclose(fp);

	return 0;
}