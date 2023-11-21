package its.lez06.oop.ereditarieta;

public class App {

	public static void main(String[] args) {

		Animale ani = new Animale("Gatto Europeo", "F", 4);
		System.out.println(ani.toString());
		
		
		Gatto gat = new Gatto(true, "Boh", "M");
		System.out.println(gat.toString());
		
	}

}
