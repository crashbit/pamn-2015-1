public class Saludo{
	String tipoSaludo;

	public static void main(String args[]){
		System.out.println("Hola mundo");
		
		Saludo saludito = new Saludo();
		saludito.tipoSaludo = "Hey!!";
		System.out.println(saludito.tipoSaludo);
	}
}