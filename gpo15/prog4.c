#include <stdio.h>

int main(){

	int *p;
	int x;
	x= 22;

	p = &x;

	printf("\n\n %p -> %p, %d -> %d ",p, &x, *p, x);
	*p = 37;
	printf("\n\n %p -> %p, %d -> %d ",p, &x, *p, x);

	printf("\n\n");

	return 0;
}
