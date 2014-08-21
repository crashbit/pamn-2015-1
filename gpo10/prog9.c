#include <stdio.h>

int main(){

	FILE *fp;

	fp = fopen("numeros.txt", "w");

	char nombres[] = "German Santos";

	fputs(nombres, fp);


	fclose(fp); 

	printf("\n\n");
	return 0;
}