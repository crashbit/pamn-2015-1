#include <stdio.h>

int main(){

	int x;
	int *p;

	x = 5;
	p = &x;

	printf("\n %p ==== %p", &p, &x);
	*p = 56;
	printf("\n %d",x);

	printf("\n\n");

	return 0;
}