/*
* Manejo de arreglos, pract.1
*/
#include <stdio.h>

int main(){
	
	int arreglo[10] = {2,3,5,1,8,7,-1,2,0,21};
	int i;

	for(i=0; i< 10; i++){
		printf("\n %p === %d", &arreglo[i], arreglo[i]);
	}

	printf("\n\n");
	return 0;
}