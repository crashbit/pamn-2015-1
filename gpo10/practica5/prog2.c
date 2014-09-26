<<<<<<< HEAD
=======
// Eliminación hacia adelante con sustitución hacia atras
// Método de Gauss

>>>>>>> FETCH_HEAD
#include <stdio.h>

int main(){
	
<<<<<<< HEAD
	float a[3][3]={{1,2,3},{4,5,6},{3,1,2}};
	float b[3] = {9,24,4};
	float x[3];
	float sum;
	float a21;
	float m;
=======
	float a[3][3]={{1,1,-1},{3,2,1},{5,3,4}};
	float b[3] = {1,1,2};
	float x[3];
	float a21;
	float m, sum;
>>>>>>> FETCH_HEAD
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
<<<<<<< HEAD
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

=======


	// Sustitución hacia atrás
	x[n-1] = b[n-1]/a[n-1][n-1]; 

	for(i=n-2;i>=0;i--){
		sum = 0;
		for(j=i+1;j<n;j++){
			sum = sum + a[i][j] * x[j];
		}
		x[i] = (b[i]-sum)/a[i][i];
	}

	// Se imprime la matriz A y vector b
>>>>>>> FETCH_HEAD
	for(i=0;i<n;i++){
		for(j=0;j<n; j++){
			printf("%f,", a[i][j]);
		}
<<<<<<< HEAD
		printf("\t| %f \n", b[i]);
	}

=======
		printf("\t|%f", b[i]);
		printf("\n");
	}

	// Se imprime el vector x, que tiene nuestros resultados.
	printf("\nResultado en el vector x\n");
>>>>>>> FETCH_HEAD
	for(i=0;i<n;i++){
		printf("%f\n", x[i]);
	}

<<<<<<< HEAD

=======
>>>>>>> FETCH_HEAD
	printf("\n\n");

	return 0;
}