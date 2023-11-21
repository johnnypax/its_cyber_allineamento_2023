package its.lez06.oop.interfaccia;

public class Gatto implements Animale {

	private boolean peloso = true;
	
	public boolean isPeloso() {
		return peloso;
	}

	public void setPeloso(boolean peloso) {
		this.peloso = peloso;
	}

	@Override
	public void metodoLocomozione() {
		System.out.println("Cammina");
	}

	@Override
	public void versoEmesso() {
		System.out.println("Miau");
	}
	
}
