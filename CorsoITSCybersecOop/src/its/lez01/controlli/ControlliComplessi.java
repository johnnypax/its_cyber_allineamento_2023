package its.lez01.controlli;

public class ControlliComplessi {

	public static void main(String[] args) {

//		System.out.println("Ciao Giovanni");
//		
//		String frase = "Ciao Mario";
//		System.out.println(frase);
		
		
//		String nome = "Giovanni";
//		System.out.println( nome.equals("GIOVANNI") );
		
		//-----------------------------------------
		

//      String provincia = "BO";
//
//      if(provincia.equals("AQ")){
//          System.out.println("L'Aquila");
//      }
//      else {
//          if(provincia.equals("MI")){
//              System.out.println("Milano");
//          }
//          else{
//              if(provincia.equals("BO")){
//                  System.out.println("Bologna");
//              }
//              else{
//                  System.out.println("Non trovata");
//              }
//          }
//      }
		
//		  String provincia = "BO";
//
//	      if(provincia.equals("AQ"))
//	          System.out.println("L'Aquila");
//	      else if(provincia.equals("MI"))
//        	  System.out.println("Milano");
//	      else if(provincia.equals("BO"))
//	          System.out.println("Bologna");
//	      else
//	          System.out.println("Non trovata");
		
		String provincia = "BO";
		
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
