public class HiloContador extends Thread{

	int contador = 10;
	static int hilos = 0;
	int tiempo = 1000;

	public HiloContador(){
		super("Hilo " +  ++hilos);
	}

	public HiloContador(int tiempo){
		super("Hilo " +  ++hilos);
		this.tiempo = tiempo;
	}

	public String toString(){
		return getName() + ": " + contador;
	}

	public void run(){

		while(contador > 0){
			System.out.println(this);
			contador--;
			try{

				sleep(tiempo);
			}catch(InterruptedException e){

			}
		}
		System.out.println("Hilo " +getName()+" terminado");
	}

	public static void main(String args[]){
			int i;
			Thread hilo;
			Thread hilo2=new HiloContador(5000);
			Thread hilo3 = new HiloContador(2000);
			Thread hilo4 = new HiloContador(500);


			for(i=0;i<5;i++){
				hilo = new HiloContador();
				hilo.start();
			}

			hilo2.start();
			hilo3.start();
			hilo4.start();



	}

}