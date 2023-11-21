package its.lez08.statiche;

public class App {

	public static void main(String[] args) {
		
		System.out.println( Persona.getContatore() );
		
		Persona gio = new Persona();
		Persona mar = new Persona();
		Persona val = new Persona("Valeria", "Verdi");
		
//		Persona.contatore = 588;		//NOn più possibile
		
		System.out.println( Persona.getContatore() );


	}

}
