package modelo;

public class Sistema {
	private ModuloTecnicos moduloTecnicos = new ModuloTecnicos();

	public static Sistema getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public Tecnico solicitarTecnico() {
		return this.moduloTecnicos.solicitarTecnico();
	}

	public void retornaTecnico(Tecnico t) {
		this.moduloTecnicos.retornaTecnico(t);
		
	}

}
