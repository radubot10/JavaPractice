package Interfata;

public class PersoanaITstInterface extends PersoanaInterface implements ITst {

    public PersoanaITstInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void scrieCod() {
        System.out.println("ITstul scrie cod.");

    }

    @Override
    public void ruleazaTeste() {
        System.out.println("ITstul ruleaza teste.");

    }
}
