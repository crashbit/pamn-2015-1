#include <stdio.h>

int main(){

	FILE *fp;

	fp = fopen("numeros.txt", "w");

	fputc('a', fp);
	fputc('b', fp);
	fputc('c', fp);

	
	fclose(fp); 

	printf("\n\n");
	return 0;
}
