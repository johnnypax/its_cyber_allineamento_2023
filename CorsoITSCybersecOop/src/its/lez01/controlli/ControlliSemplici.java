package its.lez01.controlli;

public class ControlliSemplici {

	public static void main(String[] args) {


		/*
		 if(condizione){
		 	//Condizione positiva
		 }
		 else{
		 	//Condizione negativa
		 }
		 */
		
//		System.out.println("Inizio programma");
//		
//		if(false) {
//			System.out.println("Sono nel ramo true");
//		}
//		else {
//			System.out.println("Sono nel ramo false");
//		}
//
//		System.out.println("Fine programma");
		
		//-------------------------------------
		
        // > 	Maggiore
        // >= 	Maggiore o uguale
        // < 	Minore
        // <=	Minore o uguale
        // ==	Uguale a
        // !=	Diverso da
		
//		System.out.println(5 != 5);
		
		//-------------------------------------

//		int eta = 18;
//		
//		if(eta >= 18) {
//			System.out.println("Maggiorenne");
//		}
//		else {
//			System.out.println("Minorenne");
//		}
		
		//-------------------------------------
//		int eta = 250;
//	
//		
//		if(eta >= 0) {
//			if(eta <= 130) {
//				System.out.println("Fai il controllo");
//			}
//			else {
//				System.out.println("Errore nell'età");
//			}
//		}
//		else {
//			System.out.println("Errore nell'età");
//		}
		
		//-------------------------------------

//		//int eta = 45;
//		// TRUE     &&     TRUE        = TRUE
//		//    1      x        1        = 1
//		
//		//int eta = -15;
//		// FALSE    &&    TRUE         = FALSE
//		//     0     x       1         = 0
//		
//		int eta = 250;
//		//   TRUE   &&    FALSE        = FALSE
//		//      1    x        0        = 0
//		if(eta >= 0 && eta <= 130) {
//			System.out.println("Fai il controllo");
//		}
//		else {
//			System.out.println("Errore nell'età");
//		}
		
		//-------------------------------------

////		int eta = 45;
//		//  FALSE  ||   FALSE       = FALSE
//		//      0   +       0       = 0
//		
////		int eta = -15;
//		//  TRUE   ||   FALSE       = TRUE
//		//     1    +       0       = 1
//		
//		int eta = 250;
//		//  FALSE  ||    TRUE = TRUE
//		//      0   +       1 = 1
//		if(eta < 0 || eta > 130) {
//			System.out.println("Errore nell'età");
//		}
//		else {
//			System.out.println("Fai il controllo");
//		}
		
		//-------------------------------------
		
//		System.out.println(!true);
		
		int eta = 17;
		
		if(!(eta >= 18)) {						//Il ! ovvero NOT, scambia i rami
			System.out.println("Minorenne");
		}
		else {
			System.out.println("Maggiorenne");
		}
		
		 
	}

}
