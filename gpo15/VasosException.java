public class VasosException extends Exception{
	
	public VasosException(){
		super("Error al pedir los vasos");
	}

	public VasosException(String mensaje){
		super(mensaje);
	}
}