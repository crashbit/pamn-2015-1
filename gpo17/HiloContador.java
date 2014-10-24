public class HiloContador implements Runnable{
	
	public String id;
	int contador = 10;

	static int hilos = 0;

	public HiloContador(){
		hilos++;
		id = "hilo " + hilos;
	}

	public String toString(){
		return "Enfin: " + contador;
	}

	public void run(){
		while(contador > 0){
			System.out.println(this);
			contador--;
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){

			}
		}
	}

	public static void main(String args[]){
		int i;
		Thread hilo;
		for(i=0;i<5;i++){
			hilo = new Thread(new HiloContador());
			hilo.start();
		}
	}
}






