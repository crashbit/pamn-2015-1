#include <stdio.h>
#include <math.h>

double f(double num);

int main(){
double a, b, c, error, tolerancia;
int iteracion = 0;

a = 1.2; 
b = 1.4;
error = 0.0;
tolerancia = 0.002;

do{
	c = (a+b)/2;
	if(f(a)*f(c)<0)
		b = c;

	else
		a = c;

	error = fabs(a - b); 

	printf("\n %d .- Valor de c %f - Error %f",iteracion, c, error);
	iteracion = iteracion + 1 ;

}while(error > tolerancia);

printf("\n\n");

}

double f(double num){

	return (num * exp(num)) - 5;
}


















