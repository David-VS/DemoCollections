package beestjes;

import beestjes.gedrag.KanVliegen;

import java.time.LocalDate;

public class Vleermuis extends Zoogdier implements KanVliegen {

    public Vleermuis(LocalDate geboorteDatum, String naam) {
        super(geboorteDatum, naam);
    }

    @Override
    public String maakGeluid() {
        return "Fladder fladder";
    }

    @Override
    public void vlieg() {
        System.out.println("ik vlieg");
    }
}
