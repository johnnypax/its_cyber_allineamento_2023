package its.lez07.poly;

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
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	
}
