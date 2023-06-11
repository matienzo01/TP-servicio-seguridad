package modelo;

import java.util.ArrayList;

public class ModuloTecnicos {
	private ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>(); //podria ser una queue o algo asi
	
	/**
	 * Esto supone que no se va a ejecutar mientras se este desarrollando la simulacion
	 */
	public void darAltaTecnico() {
		this.tecnicos.add(null);
	}
	
	public synchronized Tecnico solicitarTecnico(){
		while(tecnicos.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Tecnico t = this.tecnicos.get(0);
		this.tecnicos.remove(0);
		notifyAll();
		return t;
	}
	
	public synchronized void retornaTecnico(Tecnico t) {
		this.tecnicos.add(t);
	}
}
