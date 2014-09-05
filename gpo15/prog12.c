#include <stdio.h>

int main(){
	
	float a[3][3] = {{1,2,3},{4,5,6},{3,1,2}};
	float b[3]={9,24,4};
	float x[3];
	int i, j, k, n = 3;

	float m, a21;

	for(i=0;i<n; i++){
		for(j=i+1;j<n;j++){
			m = a[j][i]/a[i][i];
			for(k=0;k<n;k++){
				a[j][k] = a[j][k] - m * a[i][k];
			}
			b[j] = b[j] - m * b[i]; 
		}
	}

	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			printf("%f ", a[i][j]);
		}
		printf("\t| %f", b[i]);
		printf("\n");
	}

	printf("\n\n");

	return 0;
}