#include <stdio.h>

int main(){
	
	float a[3][3]={{1,2,3},{4,5,6},{3,1,2}};
	float b[3] = {9,24,4};
	float a21;
	float m;
	int i,j,n, k;

	n = 3;
	// i son columnas
	// j son renglones

	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			m = a[j][i]/a[i][i];
			for(k=i;k<n;k++){
				a[j][k] = a[j][k] - m * a[i][k];
			}
			b[j] = b[j] - m * b[i];
		}
	}

	for(i=0;i<n;i++){
		for(j=0;j<n; j++){
			printf("%f,", a[i][j]);
		}
		printf("\n\n");
	}


	printf("\n\n");

	return 0;
}