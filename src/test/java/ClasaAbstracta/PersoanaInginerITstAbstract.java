package ClasaAbstracta;

public class PersoanaInginerITstAbstract extends PersoanaAbstract {

    public String nume;
    public String prenumee;

    public PersoanaInginerITstAbstract(String nume, String prenumee) {
        this.nume = nume;
        this.prenumee = prenumee;
    }

    @Override
    public void proiecteaza() {
        System.out.println("Inginer-IT-stul scrie cod.");
    }

    @Override
    public void executa() {
        System.out.println("Inginer-IT-stul scrie cod.");
    }

    @Override
    public void scrieCod() {
        System.out.println("Inginer-IT-stul scrie cod.");
    }

    @Override
    public void ruleazaTeste() {
        System.out.println("Inginer-IT-stul ruleaza teste.");
    }
}
