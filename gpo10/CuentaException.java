public class CuentaException extends Exception{
	
	public CuentaException(){
		super("CuentaException es lanzado...");
	}

	public CuentaException(String mensaje){
		super(mensaje);
	}


}