package Command.clase;

public class Autobuz {

    String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaInCursa(int nrLinie){
        System.out.println("Autobuzul " + model + " pleaca pe linia " + nrLinie);
    }

}
