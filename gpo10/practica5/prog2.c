#include <stdio.h>

int main(){
	
	float a[3][3]={{1,2,3},{4,5,6},{3,1,2}};
	float b[3] = {9,24,4};
	float x[3];
	float sum;
	float a21;
	float m;
	int i,j,n, k;

	n = 3;
	// i son renglones
	// j son columnas

	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			m = a[j][i]/a[i][i];
			for(k=i;k<n;k++){
				a[j][k] = a[j][k] - m * a[i][k];
			}
			b[j] = b[j] - m * b[i];
		}
	}
	// i = 2

	x[n-1] = b[n-1]/a[n-1][n-1];
	printf("%f\n\n\n", x[n-1]);

	for(i = n-2; i>=0; i--){
		sum = b[i];
		for(j=i;j<n;j++){
			sum = sum - a[j][i]* x[i];
		}
		x[j] = sum / a[j][i];
	}

	for(i=0;i<n;i++){
		for(j=0;j<n; j++){
			printf("%f,", a[i][j]);
		}
		printf("\t| %f \n", b[i]);
	}

	for(i=0;i<n;i++){
		printf("%f\n", x[i]);
	}


	printf("\n\n");

	return 0;
}