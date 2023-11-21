package its.lez06.oop.astrazione;


public abstract class Animale {

	private String razza;
	private String sesso;
	private int numZampe;

	public Animale() {
		System.out.println("Sono il costruttore di Animale");
	}
	
	public String getRazza() {
		return razza;
	}
	public void setRazza(String razza) {
		this.razza = razza;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public int getNumZampe() {
		return numZampe;
	}
	public void setNumZampe(int numZampe) {
		this.numZampe = numZampe;
	}

	@Override
	public String toString() {
		return "Animale [razza=" + razza + ", sesso=" + sesso + ", numZampe=" + numZampe + "]";
	}
	
	public abstract void versoEmesso();
}
