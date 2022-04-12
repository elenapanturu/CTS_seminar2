package adapter.metrou;

public class ValidatorMetrou implements ValidatorSubteran {
    @Override
    public void validareCalatorie() {
        System.out.println("am validat bilet adapter.metrou");
    }

    @Override
    public void validareAbonament() {
        System.out.println("am validat abonament adapter.metrou" +
                "");
    }
}
