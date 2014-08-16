#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){
	
	struct Alumno{
		char nombre[20];
		int edad;
		float promedio;
	};

	struct Alumno *fi;

	fi=(struct Alumno *)malloc(sizeof(struct Alumno));

	fi->edad = 34;
	fi->promedio = 6.1;
	strcpy(fi->nombre, "Yolanda");

	printf("%s , %d, %f", fi->nombre, fi->edad, fi->promedio);

	printf("\n\n");
}