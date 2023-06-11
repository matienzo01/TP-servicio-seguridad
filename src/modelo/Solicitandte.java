package modelo;

public class Solicitandte extends Thread {

	public void run() {
		Tecnico t = Sistema.getInstance().solicitarTecnico();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sistema.getInstance().retornaTecnico(t);
	}
	
}
