#include <stdio.h>
#include <math.h>

float f(float num);

int main(){
	
	float a,b,c, tolerancia, error=0;
	int i=0;
	a = 1.2;
	b = 1.4;

	tolerancia = 0.002;

	do{
		c = (a+b)/2;

		if(f(a)*f(c)< 0)
			b=c;
		else
			a=c;

		i = i+1;

		error = fabs(a -b);

		printf("\n %d.- %f", i, c);

	}while(error > tolerancia || f(c)==0);
	printf("\n\n");

}

float f(float num){

	return (num * exp(num) - 5);
}










