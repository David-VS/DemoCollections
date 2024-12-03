package beestjes;

import java.time.LocalDate;

public abstract class Dier implements Comparable<Dier>{
    private LocalDate geboorteDatum;
    private String naam;

    public Dier(LocalDate geboorteDatum, String naam) {
        this.geboorteDatum = geboorteDatum;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                +" {" +
                "geboorteDatum=" + geboorteDatum +
                ", naam='" + naam + '\'' +
                '}';
    }

    public abstract String maakGeluid();

    @Override
    public int compareTo(Dier o) {
        return this.naam.compareTo(o.naam);
    }
}
