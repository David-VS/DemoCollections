package beestjes;

import beestjes.gedrag.KanZwemmen;

import java.time.LocalDate;

public class Tijger extends Zoogdier implements KanZwemmen {

    public Tijger(LocalDate geboorteDatum, String naam) {
        super(geboorteDatum, naam);
    }

    @Override
    public String maakGeluid() {
        return "rawr xD";
    }

    @Override
    public void zwem() {
        System.out.println("ik zwem");
    }
}
