package its.lez07.poly;

public class Docente extends Persona{
	
	private String dipartimento;
	
	public Docente() {
		
	}

	public Docente(String nome, String cognome, String dipartimento) {
		super.nome = nome;
		super.cognome = cognome;
		this.dipartimento = dipartimento;
	}
	
	public String getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(String dipartimento) {
		this.dipartimento = dipartimento;
	}
	

	@Override
	public String toString() {
		return "Docente [nome=" + nome + ", cognome=" + cognome + ", dipartimento=" + dipartimento + "]";
	}

}
