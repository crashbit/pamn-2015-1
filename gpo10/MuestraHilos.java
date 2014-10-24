public class MuestraHilos extends Thread{
	
	int contador = 10;
	static int hilos = 0;

	public MuestraHilos(){
		super("Hilo " + ++hilos);
	}

	public String toString(){
		return getName() + ": " + contador;
	}

	public void run(){
		while(contador > 0){
			System.out.println(this);
			contador--;
			yield();
		}

		System.out.println(getName() + " terminado");
	}

	public static void main(String args[]){
		int i;
		Thread hilo;

		for(i=0;i<5;i++){
			hilo = new MuestraHilos();
			hilo.start();
		}
	}

}





