package ClasaAbstracta;

public class PersoanaITstAbstract extends PersoanaAbstract{

    public String nume;
    public String prenume;

    public PersoanaITstAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void proiecteaza() {
        System.out.println("IT-stul proiecteaza.");
    }

    @Override
    public void executa() {
        System.out.println("IT-stul executa.");
    }

    @Override
    public void scrieCod() {
        System.out.println("IT-stul scrie cod.");

    }

    @Override
    public void ruleazaTeste() {
        System.out.println("Inginer-IT-stul ruleaza teste.");

    }
}
