package Interfata;

import org.junit.Test;

public class InterfataTest {
    @Test

    public void testAutomat(){
        PersoanaInginerInterface Florin = new PersoanaInginerInterface("Matei", "Florin");
        Florin.executie();
        Florin.proiecteaza();

        PersoanaITstInterface Alex = new PersoanaITstInterface("Dorha", "Alex");
        Alex.ruleazaTeste();
        Alex.scrieCod();

        PersoanaInginerITstInterface Radu = new PersoanaInginerITstInterface("Botareanu", "Radu");
        Radu.proiecteaza();
        Radu.executie();
        Radu.scrieCod();
        Radu.ruleazaTeste();
        }
    }
