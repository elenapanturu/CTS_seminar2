package factoryMethod;
import familie.MijlocTransport;
public class Tramvai extends MijlocTransport{
	public Tramvai(String nrInmatriculare) { 
		super(nrInmatriculare);
	}
	
	public String toString() {
		String result = "Tramvai " + nrInmatriculare;
		return result;
	}
}
