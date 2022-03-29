package factoryMethod;

import familie.MijlocTransport;

public interface Factory {
	MijlocTransport createObject(String nrInmatriculare);
}
