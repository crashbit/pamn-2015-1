/*
* Manejo de arreglos, algortimo de burbuja
*/
#include <stdio.h>

int main(){
	
	int arreglo[10] = {2,3,5,1,8,7,-1,2,0,21};
	int i, j;
	int temp;
	int n=10;

	for(i = 0; i < n; i++){
		for(j = i+1; j< n; j++){
			if(arreglo[i]>arreglo[j]){
				temp = arreglo[i];
				arreglo[i] = arreglo[j];
				arreglo[j] = temp;
			}
		}
	}

	for(i = 0; i < n; i++){
		printf("%d , ", arreglo[i]);
	}
}









