package clase;

public class AutobuzDeNoapte implements MijlocTransport{

    Autobuz autobuz;

    public AutobuzDeNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori()>0){
            autobuz.opresteInStatie();
        }
        else System.out.println("NU EXISTA CALATORI! || NU OPRESTE IN STATIE");
    }
}
