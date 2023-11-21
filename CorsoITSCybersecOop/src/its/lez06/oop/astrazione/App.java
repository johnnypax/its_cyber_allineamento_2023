package its.lez06.oop.astrazione;

public class App {

	public static void main(String[] args) {

//		Animale gio = new Animale();
		
		Gatto mar = new Gatto();
		mar.setRazza("Europeo");		//Ereditato dal padre
		mar.setSesso("F");
		mar.setBaffi(true);				//Mio proprietario
		mar.versoEmesso();
		
		Canarino car = new Canarino();
		
	}

}
