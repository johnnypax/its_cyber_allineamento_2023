package its.lez06.oop.interfaccia;

public class Canarino implements Animale{

	private String razza;
	private String colore;
	
	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public void metodoLocomozione() {
		System.out.println("Vola");
	}

	@Override
	public void versoEmesso() {
		System.out.println("CIp cip");
	}

}
