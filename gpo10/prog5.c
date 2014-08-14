#include <stdio.h>

int main(){

	int x[5] = {1, 2, 4, 6, 7};
	int *p;

	p = x;

	printf("\n %p - %p - %p", p, x, &x[0]);
	p++;
	printf("\n %d", p[0]);

	printf("\n\n");

	return 0;
}

