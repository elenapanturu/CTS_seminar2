package clase;

public class Autobuz implements Nod{
    private String productor;
    private String model;
    private int nrLocuri;

    public Autobuz(String productor, String model, int nrLocuri) {
        this.productor = productor;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void adaugaNod(Nod nod) throws Exception {
        throw new Exception("Nu se poate adauga");
    }

    @Override
    public void stergeNod(Nod nod) throws Exception {
        throw new Exception(("Nu se poate sterge!"));
    }

    @Override
    public Nod getNod(int poz) throws Exception {
        throw new Exception(("Nu se poate obtine!"));
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());
    }

    @Override
    public float calculeazaSumaGarantie(int pretPeLoc) {
        return nrLocuri*pretPeLoc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("productor='").append(productor).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
