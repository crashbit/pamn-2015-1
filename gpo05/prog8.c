#include <stdio.h>

int main(){
	
	FILE *fp;

	fp = fopen("holaquehace.txt", "r");

	if(fp == NULL){
		printf("No se encuentra el archivo :P ");
	}
	else{
		while(!feof(fp)){
			printf("%c", fgetc(fp));
		}
	}

	return 0;
}
