#include <stdio.h>
#include <math.h>

double f(double num);

int main(){
double a, b, c, error;
int iteracion = 0;

a = 1.2; 
b = 1.4;

do{
	c = (a+b)/2;
	if(f(a)*f(c)<0)
		b = c;

	else
		a = c;



	printf("\nValor de c %f", c);
	iteracion = iteracion + 1 ;

}while(iteracion < 15);

printf("\n\n");

}

double f(double num){

	return (num * exp(num)) - 5;
}


















