package main;
import singleton.Singleton;
import familie.Autobuz;
import familie.Factory;
import familie.MijlocTransport;
import familie.TipTransport;
import familie.Tramvai;
import familie.Troleibuz;

public class Main {
	public static void main(String[] args) {
	
	Singleton s = Singleton.getInstance();
	
	Singleton s2 = Singleton.getInstance();
	
	System.out.println(s);
	System.out.println(s2);
	
	
	
	
	Factory fabrica = new  Factory();
	MijlocTransport a = fabrica.createObject(TipTransport.AUTOBUZ, "B101ENA");
	MijlocTransport b = fabrica.createObject(TipTransport.TROLEIBUZ, "BR105CNA");
	MijlocTransport c = fabrica.createObject(TipTransport.TRAMVAI, "CJ101TTA");

	
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}
