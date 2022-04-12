package adapter.autobuz;

import adapter.metrou.ValidatorMetrou;

public class AdaptorValidatorMetrou extends ValidatorMetrou implements ValidatorAutobuz {
    @Override
    public void validareBilet() {
        super.validareCalatorie();
    }
}
