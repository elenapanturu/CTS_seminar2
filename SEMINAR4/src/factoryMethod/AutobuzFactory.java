package factoryMethod;

import familie.MijlocTransport;

public class AutobuzFactory implements Factory{

	@Override
	public MijlocTransport createObject(String nrInmatriculare) {
		// TODO Auto-generated method stub
		return new Autobuz(nrInmatriculare);
	}

}
