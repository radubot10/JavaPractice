package ClasaAbstracta;

import Interfata.PersoanaITstInterface;
import Interfata.PersoanaInginerITstInterface;
import Interfata.PersoanaInginerInterface;
import org.junit.Test;

public class AbstractTest {
    @Test

  public void testAutomat(){

        PersoanaInginerAbstract Florin = new PersoanaInginerAbstract("Matei", "Florin");
        Florin.executa();
        Florin.proiecteaza();
        Florin.afiseazaVarsta(28);

        PersoanaITstAbstract Alex = new PersoanaITstAbstract("Dorha", "Alex");
        Alex.ruleazaTeste();
        Alex.scrieCod();
        Alex.afiseazaVarsta(27);

        PersoanaInginerITstAbstract Radu = new PersoanaInginerITstAbstract("Botareanu", "Radu");
        Radu.proiecteaza();
        Radu.executa();
        Radu.scrieCod();
        Radu.ruleazaTeste();
        Radu.afiseazaVarsta(30);
    }
}
