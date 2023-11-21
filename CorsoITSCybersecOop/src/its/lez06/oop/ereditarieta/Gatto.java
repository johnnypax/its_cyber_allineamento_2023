package its.lez06.oop.ereditarieta;

public class Gatto extends Animale{

	private boolean baffi;
	
	public Gatto(boolean baffi) {
		super();
		this.baffi = baffi;
		
		System.out.println("Sono il costruttore di Gatto");
	}
	
	public Gatto(boolean baffi, String razza, String sesso) {
		this.baffi = baffi;
		this.setRazza(razza);
		this.setSesso(sesso);
	}

	public boolean isBaffi() {
		return baffi;
	}

	public void setBaffi(boolean baffi) {
		this.baffi = baffi;
	}
	
	public void stampaDettagli() {
		System.out.println(this.baffi + ", " + super.getRazza());
	}
	
	public String dammiDettagli() {
		return this.baffi + ", " + super.getRazza();
	}

	@Override
	public String toString() {
		return "Gatto [baffi=" + baffi + ", razza=" + super.getRazza() + "]";
	}
	
}
