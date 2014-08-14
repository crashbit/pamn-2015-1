#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;

	p = (int *)malloc(sizeof(int));

	printf("\n %p -> %p", &p, p);
	printf("\n\n");
	return 0;

}
