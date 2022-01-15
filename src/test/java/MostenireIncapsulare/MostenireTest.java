package MostenireIncapsulare;

import org.junit.Test;

import java.util.Arrays;

public class MostenireTest {
    @Test

    public void testAutomat(){
        Audi audiA3 = new Audi("Hatchback", "automata", "Integrala", 4, 5,
                              "Dark Grey", Arrays.asList("interior piele", "volan incalzit", "ventilatie scaune",
                               "trapa panoramica"), 40000, "A3");
        audiA3.infoMasina();
        audiA3.pretFinal();

        Audi audiA8 = new Audi("Limuzina", "automata", "Integrala", 4, 4,
                               "Piano Black", Arrays.asList("interior piele", "volan incalzit", "ventilatie scaune",
                               "trapa panoramica", "masaj scaune", "ACC", "display tetiere", "roti multidirectionale"),
                               100000, "A8");

        audiA8.infoMasina();
        audiA8.pretFinal();
        audiA3.setCuloare("roz");
        audiA3.infoMasina();

        Volkswagen Golf = new Volkswagen("Hatchback", "automata", "Fata", 4, 5,
                "Light Blue", Arrays.asList("interior piele", "volan incalzit", "ventilatie scaune",
                "trapa panoramica"), 18000, "Golf", "benzina");
        Golf.infoMasina();
        Golf.pretFinal();

        Volkswagen Phaeton = new Volkswagen("Limuzina", "automata", "Integrala", 4, 5,
                "Dragon Gold", Arrays.asList("interior piele", "volan incalzit", "ventilatie scaune",
                "trapa panoramica", "masaj scaune", "ACC", "display tetiere", "roti multidirectionale"),
                100000, "Phaeton", "motorina");

        Phaeton.infoMasina();
        Phaeton.pretFinal();

    }
}
