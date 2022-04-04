package classes;

public class Avaliacao {
	private int codigoNota;
	private int nota;
	
	public Avaliacao() {
	}

	public Avaliacao(int codigoNota, int nota) {
		this.codigoNota = codigoNota;
		this.nota = nota;
	}

	public int getCodigoNota() {
		return codigoNota;
	}

	public void setCodigoNota(int codigoNota) {
		this.codigoNota = codigoNota;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
}
