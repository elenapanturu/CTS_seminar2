package main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Dorel", 20, 0);
        autobuz.opresteInStatie();

        AutobuzDeNoapte autobuzDeNoapte = new AutobuzDeNoapte(autobuz);
        autobuzDeNoapte.opresteInStatie();

    }
}
