package beestjes;

import beestjes.gedrag.KanZwemmen;

import java.time.LocalDate;

public class Slang extends Reptiel implements KanZwemmen {

    public Slang(LocalDate geboorteDatum, String naam) {
        super(geboorteDatum, naam);
    }

    @Override
    public String maakGeluid() {
        return "Ssssssssssss";
    }

    @Override
    public void zwem() {
        System.out.println("ik zwem");
    }
}
