public class Hilos implements Runnable{
	
	int contador = 10;
	static int hilos = 0;
	int id=0;
	int tiempo;

	public Hilos(){
		id = ++hilos;
	}

	public Hilos(int tiempo){
		this.tiempo = tiempo;
		id = ++hilos;
	}

	public void run(){
		while(contador > 0){
				System.out.println("Hilo: " +id+"\tcontando: "+ contador);
				contador--;
			
		}
		System.out.println("hilo:" +id+ " terminado");
	}

	public static void main(String args[]){

		Thread hilo1 = new Thread(new Hilos());
		Thread hilo2 = new Thread(new Hilos());
		hilo1.start();
		hilo2.start();
		
	}

}