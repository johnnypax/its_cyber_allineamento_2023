package its.lez02;

import java.util.Scanner;

public class CicliInput {

	public static void main(String[] args) {

		Scanner interceptor = new Scanner(System.in);
		
		boolean inserimentoAbilitato = true;
		
		while(inserimentoAbilitato) {
			System.out.println("Inserisci il nome o digita Q per uscire");
			
			String input = interceptor.nextLine();
			
			if(input.equals("Q"))
				inserimentoAbilitato = false;
			
			System.out.println("Hai scritto " + input);
		}
		
		System.out.println("FINE");
		
	}
}
