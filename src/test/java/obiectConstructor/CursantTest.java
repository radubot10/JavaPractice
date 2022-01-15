package obiectConstructor;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;

import java.util.Arrays;

public class CursantTest {

    @Test

    public void testAutomat(){
        System.out.println("--- Obiectul 1---");
        Cursant RaduBotareanu = new Cursant("Botareanu", "Radu", 30, 2.550, 'M', true, Arrays.asList("Automation Testing", "Manual Testing", "Baze de date"));
        RaduBotareanu.dateCursant();
        System.out.println("--- Obiectul modificat ---");
        RaduBotareanu.prenume = "Radu - Nicolae";
        RaduBotareanu.dateCursant();
        RaduBotareanu.verificaDiploma();

        System.out.println("--- Obiectul 2---");
        Cursant MaricarmenManolache = new Cursant("Manolache", "Maricarmen", 23, 2.550, 'F', true, Arrays.asList("Automamtion Testing", "Manual Testing", "Baze de date"));
        MaricarmenManolache.dateCursant();
        MaricarmenManolache.verificaDiploma();

        System.out.println("--- Obiectul 3 ---");
        Cursant AlexDorha = new Cursant("Dorha", "Alex", 27, 'M', true, Arrays.asList("Automation Testing", "Baze de date"));
        AlexDorha.dateCursant();

        System.out.println("--- Obiectul 4 ---");
        Cursant FlorinIonescu = new Cursant("Ionescu", "Florin", 30, 2.550, 'M',true, "Automation Testing");
        FlorinIonescu.dateCursant();
    }
}
