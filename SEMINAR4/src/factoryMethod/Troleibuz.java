package factoryMethod;
import familie.MijlocTransport;
public class Troleibuz extends MijlocTransport {
	public Troleibuz(String nrInmatriculare) { 
		super(nrInmatriculare);
	}
	
	public String toString() {
		
		return "Troleibuz "  + nrInmatriculare ;
	}
}
