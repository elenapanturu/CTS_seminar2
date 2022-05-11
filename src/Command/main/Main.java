package Command.main;

import Command.clase.Autobuz;
import Command.clase.ComandaPlecareTraseu;
import Command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("bmw");
        Autobuz autobuz2 = new Autobuz("audi");

        ComandaPlecareTraseu c1 = new ComandaPlecareTraseu(autobuz1, 1);
        operator.invoca(c1);


        operator.invoca(new ComandaPlecareTraseu(autobuz2, 2));
        operator.invoca(new ComandaPlecareTraseu(autobuz1, 4));
        operator.invoca(new ComandaPlecareTraseu(autobuz1, 6));
        operator.invoca(new ComandaPlecareTraseu(autobuz2, 18));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();


    }
}
