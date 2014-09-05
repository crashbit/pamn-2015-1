#include <stdio.h>

int main(){
	
	float a[3][3] = {{1,2,3},{4,5,6},{3,1,2}};
	float b[3]={9,24,4};
	float x[3];
	int i, j, k, n = 3;
	float sum;

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

	// Sustitución hacia atrás
	x[n-1] = b[n-1]/a[n-1][n-1]; 

	for(i=n-2;i>=0;i--){
		sum = 0;
		for(j=i+1;j<n;j++){
			sum = sum + a[i][j] * x[j];
		}
		x[i] = (b[i]-sum)/a[i][i];
	}

	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			printf("%f ", a[i][j]);
		}
		printf("\t| %f", b[i]);
		printf("\n");
	}

	for(i=0;i<n;i++){
		printf("%f\n", x[i]);
	}

	printf("\n\n");

	return 0;
}