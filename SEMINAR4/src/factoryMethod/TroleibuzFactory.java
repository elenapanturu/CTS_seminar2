package factoryMethod;

import familie.MijlocTransport;

public class TroleibuzFactory implements Factory {

	@Override
	public MijlocTransport createObject(String nrInmatriculare) {
		// TODO Auto-generated method stub
		return new Troleibuz(nrInmatriculare);
	}

}
