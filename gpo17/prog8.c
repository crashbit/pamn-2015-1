/*
*	Estructuras con memoria dinámica
*/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){
	
	struct Alumno{
		char nombre[30];
		int edad;
		float promedio;
		struct Alumno *sig;
	};

	int i;

	struct Alumno *fi;
	struct Alumno *lista, *temp;

	lista = (struct Alumno *)malloc(sizeof(struct Alumno));
	lista->sig = NULL;
	
	for(i=0; i<4;i++){
		fi = (struct Alumno *)malloc(sizeof(struct Alumno));
		fi->sig = NULL;
		
		printf("Teclea un nombre: ");
		gets(fi->nombre);
		fi->edad = 30;
		fi->promedio = 6.0;

		fi->sig = lista->sig;
		lista->sig = fi;
	}

	temp = lista->sig;
	while(temp != NULL){
		printf("\n %s , %d , %f ", temp->nombre, temp->edad, temp->promedio);
		temp = temp->sig;
	}
		

	printf("\n\n");



	return 0;
}