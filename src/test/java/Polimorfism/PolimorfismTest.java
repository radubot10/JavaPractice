package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {
    @Test

    public void testAutomat(){

        Caine labrador = new Caine("Labrador", "Mare", "Alb");
        labrador.scoateSunet();
        labrador.apeleazaMetodaParinte();
        labrador.cumparaProduse();
        labrador.cumparaProduse("Lesa");
        labrador.cumparaProduse(2);

    }
}
