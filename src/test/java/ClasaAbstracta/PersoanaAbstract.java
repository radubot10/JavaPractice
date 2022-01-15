package ClasaAbstracta;

public abstract class PersoanaAbstract {

    // Clasele abstracte = pot sau nu sa contina metode abstracte.
    // Clasa care extinde o clasa abstracta = implementeaza toate metodele abstracte.
    // O clasa abstracta poate contine un constructor = tot nu putem declara un obiect.
    // Metodele abstracte folosesc cuvantul "abstract".
    // O clasa abstracta poate implementa o interfata.
    // O interfata nu poate extinde o clasa abstracta.
    // Metodele sunt publice.

    public abstract void proiecteaza();
    public abstract void executa();
    public abstract void scrieCod();
    public abstract void ruleazaTeste();

    public void afiseazaVarsta(Integer varsta) {
        System.out.println("Are varsta de " + varsta + " ani.");

    }


}
