public class HiloContador{
	
	int contador = 10;
	static int hilos = 0;
	int id=0;

	public HiloContador(){
		id = ++hilos;
	}

	public void run(){
		System.out.println("Hilo:" + id);
		while(contador > 0){
				System.out.println("\tcontando: "+ contador);
				contador--;
		}
	}

	public static void main(String args[]){

		HiloContador test = new HiloContador();
		HiloContador test1 = new HiloContador();
		HiloContador test2 = new HiloContador();

		test.run();
		test1.run();
		test2.run();
	}

}






