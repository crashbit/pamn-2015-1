
public class ErrorPrueba{
	
	public double dividir(double a, double b){
		if(b==0){
			throw new ArithmeticException("Erroooor!!! ");
		}

		return a/b;

	}

}