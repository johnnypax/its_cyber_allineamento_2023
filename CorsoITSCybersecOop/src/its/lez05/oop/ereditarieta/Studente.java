package its.lez05.oop.ereditarieta;

public class Studente extends Persona{

	private String matricola;
	
	public Studente() {
		
	}
	
	public Studente(String nome, String cognome, String matricola) {
		super.nome = nome;
		super.cognome = cognome;
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	@Override
	public void stampaDettaglio() {
		System.out.println("STUDENTE - " + this.nome + ", " + this.cognome + " MATR: " + this.matricola);

	}
	
}
