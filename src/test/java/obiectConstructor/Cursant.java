package obiectConstructor;

import java.util.List;

public class Cursant {

    // Obiect = instanta unei clase.
    // Recunoastem un obiect dupa cuvantul "new".
    // Putem face N obiecte dintr-o clasa.
    // Structura unui obiect - NumeClasa NumeObiect = new NumeClasa (se va adauga constructorul clasei) (Dam valori pentru variabile).
    // Exemplu obiect = Cursant MateiFlorin = new Cursant().
    // Constructor = are ca rol sa initializeze variabilele unei clase.
    // Intr-o clasa putem avea N constructori.
    // Exista doua tipuri de constructori:
    // a) cu parametri
    // b) fara parametri
    // Diferentierea dintre constructori se face prin tipul parametrilor sau numarul parametrilor.
    // Daca nu facem un constructor => Exista unul by default.
    // Structura unui constructor = public NumeClasa().
    // Exemplu constructor = public Cursant().

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Character gen;
    public Boolean diplomaBac;
    public List<String> cursuriInteres;
    public String cursInteres;

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomaBac, List<String> cursuriInteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursuriInteres = cursuriInteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomaBac, String cursInteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursInteres = cursInteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomaBac, String cursInteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursInteres = cursInteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomaBac, List<String> cursuriInteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomaBac = diplomaBac;
        this.cursuriInteres = cursuriInteres;
    }

    public void dateCursant(){
        System.out.println("Datele despre cursant sunt urmatoarele: ");
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(varsta);
        if (taxa != null) {
            System.out.println(taxa);
        }
        System.out.println(gen);
        System.out.println(diplomaBac);
        System.out.println("Cursurile de interes sunt urmatoarele: ");
        if (cursuriInteres != null) {
            for (Integer index = 0; index < cursuriInteres.size(); index++) {
                System.out.println(cursuriInteres.get(index));
            }
        }
        else {
            System.out.println(cursInteres);
        }
    }
    public void verificaDiploma(){
        if (diplomaBac){
            System.out.println("Cursantul "+nume+prenume+" are diploma de bac.");
        }
        else {
                System.out.println("Cursantul "+nume+prenume+" nu are diploma de bac.");
        }
        }
    }



