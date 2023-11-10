package its.lez01.controlli;

public class TaskControlli {

	public static void main(String[] args) {

		/*
	     * TODO: ESERCIZIO!
	     * Scrivere da zero una funzione che, data la temperatura corporea mi dice se posso entrare
	     * in un locale stando attenti all'input che non deve essere inferiore di 35° e superiore a 42°
	     *
	     * La temperatura massima di ingresso è di 37.5°
	     *
	     * Possibili output sono: "Puoi entrare" | "Non puoi entrare"
	     */
		
		float temp = 36.1f;
		
		if(temp >= 35 && temp <= 42) {
			if(temp <= 37.5f) {
				System.out.println("Puoi entrare");
			}
			else {
				System.out.println("Non puoi entrare");
			}
		}
		else {
			System.out.println("Errore");
		}
	}

}
