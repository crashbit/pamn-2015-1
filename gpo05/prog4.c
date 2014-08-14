#include <stdio.h>

int main(){
	
	int x[5];
	int *p;

	p = x;

	printf("\n %p -> %p", p, x);
	//p++;
	printf("\n %p -> %p", p, &x[1]);
	printf("\n %p -> %p", &p[2], &x[2]);

	printf("\n");
}