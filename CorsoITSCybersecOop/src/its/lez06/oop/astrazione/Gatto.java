package its.lez06.oop.astrazione;

public class Gatto extends Animale{

	private boolean baffi;
	
	public Gatto() {
	}

	public boolean isBaffi() {
		return baffi;
	}

	public void setBaffi(boolean baffi) {
		this.baffi = baffi;
	}

	@Override
	public String toString() {
		return "Gatto [baffi=" + baffi + ", razza=" + super.getRazza() + "]";
	}

	@Override
	public void versoEmesso() {
		System.out.println("MIAU MIAU");
		
	}
	
}
