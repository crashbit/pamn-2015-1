#include <stdio.h>

int main(){
	
	int x;
	int *p;

	x = 5;
	p = &x;
	*p = 22;
	printf("\n %p -> %d", &x, x);
	printf("\n %p", p);
	printf("\n\n");

	return 0;
}