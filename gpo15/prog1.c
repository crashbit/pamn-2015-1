#include <stdio.h>

int main(){
	
	char x[5];

	printf("\n %p ----> %p ", x, &x[0]);
	printf("\n %p ----> %p ", x, &x[1]);
	printf("\n %p ----> %p ", x, &x[2]);

	printf("\n\n");

	return 0;
}
