package its.lez03;

public class ContenitoriSemplici {

	public static void main(String[] args) {

		int x = 5;
		int[] elenco_numeri = new int[x];
		
		elenco_numeri[0] = 55;
		elenco_numeri[1] = 2;
		elenco_numeri[2] = 23;
		elenco_numeri[3] = 12;
//		elenco_numeri[4] = "Giovanni";	
//		elenco_numeri[5] = 17;
		
		
		for(int i=0; i<elenco_numeri.length; i++) {
			System.out.println(elenco_numeri[i]);
		}
		
//		System.out.println( elenco_numeri[0] );
//		System.out.println( elenco_numeri[1] );
//		System.out.println( elenco_numeri[2] );
//		System.out.println( elenco_numeri[3] );
	
		String[] invitati = { "Giovanni", "Mario", "Valeria" };
		
		for(int i=0; i<invitati.length; i++) {
			System.out.println(invitati[i]);
		}
		
		
	}

}
