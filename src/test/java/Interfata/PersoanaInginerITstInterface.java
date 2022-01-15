package Interfata;

public class PersoanaInginerITstInterface extends PersoanaInterface implements Inginer, ITst{
    public PersoanaInginerITstInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void scrieCod() {
        System.out.println("Inginer-IT-stul scrie cod.");
    }

    @Override
    public void ruleazaTeste() {
        System.out.println("Inginer-IT-stul ruleaza teste.");
    }

    @Override
    public void proiecteaza() {
        System.out.println("Inginer-IT-stul proiecteaza.");
    }

    @Override
    public void executie() {
        System.out.println("Inginer-IT-stul executa.");
    }
}
