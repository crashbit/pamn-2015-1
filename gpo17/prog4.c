#include <stdio.h>

int main(){

	int x[5];
	int *p;

	p = x;
	//p++;
	printf("\n %p -> %p", p, &x[0]);
	printf("\n %p -> %p", &p[1], &x[1]);
	printf("\n %p -> %p", &p[2], &x[2]);
	printf("\n %p -> %p", &p[3], &x[3]);
	printf("\n %p -> %p", &p[4], &x[4]);
	printf("\n\n");


	return 0;
}