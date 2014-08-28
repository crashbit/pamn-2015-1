#include <stdio.h>
#include <math.h>

double f(double num);
double fprima(double num);

int main(){
int i=0;
double xn1, xn, tolerancia, error;
tolerancia = 0.002;
error = 0.0;

xn = 1.4;
do{
	xn1 = xn - (f(xn)/fprima(xn));

	error = fabs(xn1-xn);
	xn = xn1;
	i++;
	printf("\n%d %f -> error: %f",i, xn1, error);

}while(error > tolerancia);

printf("\n\n");

}

double f(double num){
	return (num * exp(num)) - 5;
}

double fprima(double num){
	return (num * exp(num) + exp(num));
}









