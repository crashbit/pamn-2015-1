#include <stdio.h>

int main(){

	FILE *fp;
	int numero, total = 0;

	fp = fopen("numeros.txt", "r+a");

	while(!feof(fp)){
		fscanf(fp, "%d,", &numero);
		total = total + numero;
		printf("\n %d", total);
	}

	fprintf(fp, "El resultado es %d", total);
	fclose(fp); 

	printf("\n\n");
	return 0;
}












