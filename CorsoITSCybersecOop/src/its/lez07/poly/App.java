package its.lez07.poly;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {


//		ArrayList<Docente> elencoDoce = new ArrayList<Docente>();
//		
//		Docente val = new Docente("Valeria", "Verdi", "Fisica");
//		
//		elencoDoce.add(val);
//		
//
//		ArrayList<Studente> elencoStud = new ArrayList<Studente>();
//		
//		Studente gio = new Studente("Giovanni", "Pace", "AB1234");
//		Studente mar = new Studente("Mario", "Rossi", "AB1235");
//		
//		elencoStud.add(gio);
//		elencoStud.add(mar);
		
		ArrayList<Persona> elenco = new ArrayList<Persona>();
		
		Docente val = new Docente("Valeria", "Verdi", "Fisica");
		Studente gio = new Studente("Giovanni", "Pace", "AB1234");
		Studente mar = new Studente("Mario", "Rossi", "AB1235");
		
		elenco.add(val);
		elenco.add(mar);
		elenco.add(gio);
		
		for(int i=0; i<elenco.size(); i++) {
			
			Persona temp = elenco.get(i);
			
			System.out.println(temp);
			
		}

		
	}

}
