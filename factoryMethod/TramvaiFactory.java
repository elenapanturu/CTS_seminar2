package factoryMethod;

import familie.MijlocTransport;

public class TramvaiFactory implements Factory{

	@Override
	public MijlocTransport createObject(String nrInmatriculare) {
		// TODO Auto-generated method stub
		return new Tramvai(nrInmatriculare);
	}
	
}
