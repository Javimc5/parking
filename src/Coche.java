
public class Coche extends Thread{
	private int id;
	private Barrera barrera;
	
	public Coche(int id, Barrera barrera) {
		this.id=id;
		this.barrera=barrera;
	}
	
	public void run() {
		try {
			sleep((int) ((Math.random() * 1000)+1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		barrera.entraCoche(id);
		try {
			sleep((int) ((Math.random() * 1000)+1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		barrera.saleCoche(id);
		
	}
}
