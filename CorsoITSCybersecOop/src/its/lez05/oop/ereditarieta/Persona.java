package its.lez05.oop.ereditarieta;

public class Persona {

	protected String nome;
	protected String cognome;
	
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
