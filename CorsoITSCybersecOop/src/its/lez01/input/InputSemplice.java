package its.lez01.input;

import java.util.Scanner;

public class InputSemplice {

	public static void main(String[] args) {

//		Scanner interceptor = new Scanner(System.in);
//		
//		System.out.println("Inserisci il tuo nome");
//		String nome = interceptor.nextLine();
//		System.out.println("CIao, " + nome);
		
		Scanner interceptor = new Scanner(System.in);
		
		System.out.println("Inserisci la sigla");
		String provincia = interceptor.nextLine();
		
		switch(provincia) {
			case "AQ":
				System.out.println("L'Aquila");
				break;
			case "MI":
				System.out.println("Milano");
				break;
			case "BO":
				System.out.println("Bologna");
				break;
			default:
				System.out.println("Non trovata");
				break;
		}
	}

}
