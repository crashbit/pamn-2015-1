#include <stdio.h>

int main(){
	
	int x = 22;
	int *p;
	void *caja;

	p = &x;

	caja = p;

	p = NULL;

	printf("\n %p -> %p", p, &x);
	printf("\n %p -> %p", p, caja);
	printf("\n\n");

}