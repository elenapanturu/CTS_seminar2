package singleton;

public class Singleton {
	private static Singleton instanta = null;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if(instanta == null) {
			instanta = new Singleton();
		}
		return instanta;
	}
	
}

//Companie de transport public in comun - STB
//Trebuie implementat modulul care se ocupa de crearea din obiecte din familia MijlocTransport.
//Compania de transport public detine urmatoarele tipuri de mijloace de transport: Autobuz, Troleibuz, Tramvai. Tipurile sunt salvate intr-un Enum./ NU trebuie folosit Enum.
//Sa se implementeze modulul care creeaza obiecte de aceasta familie.