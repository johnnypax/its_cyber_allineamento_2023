package its.lez07.contenitori;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Contatto gio = new Contatto("Giovanni Pace", "gio@pace.com");
		Contatto mar = new Contatto("Mario Rossi", "mario@rossi.com");
		Contatto val = new Contatto("Valeria Verdi", "val@verdi.com");
		
		ArrayList<Contatto> elenco = new ArrayList<Contatto>();
		elenco.add(val);
		elenco.add(mar);
		elenco.add(gio);
		
		for(int i=0; i<elenco.size(); i++) {
			Contatto temp = elenco.get(i);
			
			System.out.println(temp.toString());
		}
	}

}
