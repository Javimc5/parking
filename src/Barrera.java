import java.util.concurrent.Semaphore;

public class Barrera {
	private Semaphore semaforo;

	public Barrera(int plazas) {
		semaforo=new Semaphore(plazas);
	}

	public void entraCoche(Integer numeroCoche) {
		try {
			semaforo.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Entra coche "+numeroCoche);
	}
	
	public void saleCoche(Integer numeroCoche) {
		semaforo.release();
		System.out.println("Sale coche "+numeroCoche);
	}
	
}
