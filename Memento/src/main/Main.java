package main;

import clase.Autobuz;
import clase.ManagerMemento;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz ("El", 11.7, 35, "AUDI", 2008);
        System.out.println(autobuz.toString());

        ManagerMemento manager = new ManagerMemento();
        manager.addMemento(autobuz.creeazaMemento());

        autobuz.setNumeSofer("Ea");
        autobuz.setConsumMediu(18);

        manager.addMemento(autobuz.creeazaMemento());

        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Eaaaaaa");
        System.out.println(autobuz.toString());
        autobuz.restaurareMemento(manager.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
