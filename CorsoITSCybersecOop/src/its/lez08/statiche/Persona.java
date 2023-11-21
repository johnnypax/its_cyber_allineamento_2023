package its.lez08.statiche;

public class Persona {

	private String nome;
	private String cognome;
	
	private static int contatore = 0;
	
	public Persona() {
		contatore++;
	}
	
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		contatore++;
	}

	public static int getContatore() {
		return contatore;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void stampaDettaglio() {
		System.out.println("PERSONA - " + this.nome + ", " + this.cognome);
	}
}