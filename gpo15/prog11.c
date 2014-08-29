#include <stdio.h>
#include <math.h>

float f(float num);
float fprima(float num);

int main(){
	
	float a, tolerancia, error=0;
	float xi, xi1;
	int i=0;
	xi = 1.2;

	tolerancia = 0.002;

	do{
		
		xi1 = xi - (f(xi)/fprima(xi));

		i = i+1;

		error = fabs(xi1 - xi);

		xi = xi1;
		printf("\n %d.- %f", i, xi);

	}while(error > tolerancia);
	printf("\n\n");

}

float f(float num){

	return (num * exp(num) - 5);
}

float fprima(float num){

	return (num * exp(num) + exp(num));

}









