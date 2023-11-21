package its.lez06.oop.ereditarieta;

public class Animale {

	private String razza;
	private String sesso;
	private int numZampe;

	public Animale() {
		System.out.println("Sono il costruttore di Animale");
	}
	
	public Animale(String razza, String sesso, int numZampe) {
		super();
		this.razza = razza;
		this.sesso = sesso;
		this.numZampe = numZampe;
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
	
	
}
