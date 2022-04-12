package familie;

public class Autobuz extends MijlocTransport{
	
	public Autobuz(String nrInmatriculare) { 
		super(nrInmatriculare);
	}
	
	public String toString() {
		String result = "Autobuz " + nrInmatriculare;
		return result;
	}
}
