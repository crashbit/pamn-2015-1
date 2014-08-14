#include <stdio.h>

struct

int main(){
	
	void *caja;
	int *p, *q;
	int x = 33;
	
	p = NULL;
	q = NULL;

	p = &x;
	caja = p;
	q = caja;

	printf("\n %p -> %p ", caja, p);
	printf("\n %p -> %p", caja, q);
	printf("\n\n");
	return 0;
}