#include <stdio.h>

int main(){
	
	int x;
	int *p;

	x = 5;
	p = &x;

	*p = 20;
	printf("\n%p -> %p -> %d ", p, &x, x);
	printf("\n");

}