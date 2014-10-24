public class HiloContador extends Thread{
	
	int contador = 10;
	static int hilos = 0;
	int id=0;
	int tiempo;

	public HiloContador(){
		id = ++hilos;
	}

	public HiloContador(int tiempo){
		this.tiempo = tiempo;
		id = ++hilos;
	}

	public void run(){
		while(contador > 0){
				System.out.println("Hilo: " +id+"\tcontando: "+ contador);
				contador--;
			try{
				sleep(tiempo);
			}catch(InterruptedException s){

			}
		}
		System.out.println("hilo:" +id+ " terminado");
	}

	public static void main(String args[]){

		HiloContador test = new HiloContador(1000);
		HiloContador test1 = new HiloContador(2000);
		HiloContador test2 = new HiloContador(500);
		HiloContador test3 = new HiloContador(3000);

		test.start();
		test1.start();
		test2.start();
		test3.start();
	}

}