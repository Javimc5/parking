
public class Main {

	public static void main(String[] args) {
		int plazas = 5;
		int numCoches = 10;
		Barrera barrera = new Barrera(plazas);
		Coche[] coches = new Coche[numCoches];
		for (int i = 0; i < numCoches; i++) {
			coches[i] = new Coche(i + 1, barrera);
			coches[i].start();
		}

		for (int i = 0; i < numCoches; i++) {
			try {
				coches[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
