package prototype;

public class Tramvai implements MijlocTransport {
    private String numeVataman;

    public Tramvai(String numeVataman) {
        this.numeVataman = numeVataman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("numeVataman='").append(numeVataman).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
