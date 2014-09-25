#include <stdio.h>

int main(){

	float matriz[10][10]={{0.1, 2.31},{0.4,3.36},{0.7,4.59},{1,6}};
	int n=4;

	int i, j;

	for(i=1; i<=n; i++){
		for(j=0; j<n-i; j++){
matriz[j][i+1] = (matriz[j+1][i]-matriz[j][i])/(matriz[j+i][0]-matriz[j][0]);
		}
	}

	for(i=0;i<=n;i++){
		for(j=0;j<=n;j++){
			printf("\t%f", matriz[i][j]);
		}
		printf("\n");
	}
	return 0;
}
