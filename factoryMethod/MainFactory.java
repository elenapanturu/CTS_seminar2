package factoryMethod;

import familie.MijlocTransport;

public class MainFactory {
 public static void main(String [] args) {
	 MijlocTransport autobuz = new AutobuzFactory().createObject("B134DAM");
	 System.out.println(autobuz.toString());
	 
	 
	 MijlocTransport troleibuz = new TroleibuzFactory().createObject("CJ12TNN");
	 System.out.println(troleibuz.toString());
	 
	 MijlocTransport tramvai = new TramvaiFactory().createObject("BV45EEN");
	 System.out.println(tramvai.toString());
 }
}
