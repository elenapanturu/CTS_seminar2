package Command.clase;

public class ComandaPlecareTraseu implements  Command{

    Autobuz autobuz;
    int nrLinie;

    public ComandaPlecareTraseu(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void executa() {
       autobuz.pleacaInCursa(nrLinie);
    }
}
