#include <stdio.h>

int main(){
	
	int x[5] = {2, 4, 5, 6, -1};
	int i,j, n=5;
	int temp;

	for(i=0;i<n;i++){
		for(j=i+1; j< n; j++){
			if(x[i]>x[j]){
				temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}
		}
	}

	for(i=0; i< n; i++){ 

		printf("%d ", x[i]);

	}

	printf("\n\n");

	return 0;
}