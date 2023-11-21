package its.lez07.contenitori;

public class Contatto {

	private String nominativo;
	private String email;
	
	public Contatto() {
		
	}
	
	public Contatto(String nominativo, String email) {
		super();
		this.nominativo = nominativo;
		this.email = email;
	}

	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
