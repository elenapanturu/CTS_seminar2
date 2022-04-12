package adapter.autobuz;

public class Autobuz implements ValidatorAutobuz {
    @Override
    public void validareAbonament() {
        System.out.println("Am validat abonament adapter.autobuz");
    }

    @Override
    public void validareBilet() {
        System.out.println("Am validat bilet adapter.autobuz" +
                "");
    }
}
