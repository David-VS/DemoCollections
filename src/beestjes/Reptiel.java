package beestjes;

import java.time.LocalDate;

public abstract class Reptiel extends Dier{

    public Reptiel(LocalDate geboorteDatum, String naam) {
        super(geboorteDatum, naam);
    }
}
