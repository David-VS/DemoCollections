package beestjes;

import java.time.LocalDate;

public abstract class Zoogdier extends Dier{

    public Zoogdier(LocalDate geboorteDatum, String naam) {
        super(geboorteDatum, naam);
    }
}
