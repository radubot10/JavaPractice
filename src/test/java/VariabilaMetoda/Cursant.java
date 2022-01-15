package VariabilaMetoda;

import org.junit.Test;

public class Cursant {

    //Am facut un comentariu.
    //Clasa = Un sablon de variabile si metode. (Defineste un comportament)
    //Variabila = Atributul unei clase.
    //Metode = Actiunea unei clase.
    //Tot timpul o clasa va avea langa nume cuvantul "class".
    //O clasa trebuie sa aiba un nume.
    //O clasa trebuie sa fie publica. => Oricine poate sa vada clasa respectiva.
    //Variabila poate fi de doua tipuri:
    //a) variabila globala - Este vizibila peste tot in clasa respectiva. (Variabila globala structura = public tipVariabila NumeVariabila)
    //b) variabila locala - Este vizibila doar in locul unde a fost scrisa. (Variabila locala structura = tipVariabila NumeVariabila)
    //O variabila poate (sau nu) sa primeasca o valoare. Putem da o valoare unei variabile cu "=".
    //Metodele sunt de doua feluri:
    //a) Void (Structura = public void NumeMetoda)(){}
    //b) Return (Structura = public TipVariabila NumeMetoda)(){}

    public String Nume;
    public String Prenume;
    public String Adresa;
    public String AdresaNumar;
    public Integer Varsta;
    public Double Greutate;
    public Double Experienta;

    @Test
    public void testAutomat(){
        InscriereCurs();
        PlatesteTaxa();
        CalculeazaSuma();
        System.out.println(getSalariu());
        System.out.println(getAdresa());
    }

    @Test
    public void InscriereCurs(){
        Nume="Botareanu";
        Prenume="Radu";
        Adresa="Strada Sub Cetate";
        AdresaNumar="43F";
        Varsta=30;
        Greutate=95.5;
        Experienta=9.2;

        //Afisam o valoare in consola
        //Print = Printeaza si ramane cu cursorul pe linia curenta
        //Println = Printeaza si apoi trece cu cursorul la linia urmatoare
        System.out.print(Nume+" ");
        System.out.println(Prenume);
        System.out.print(Adresa+","+" "+"nr."+" ");
        System.out.println(AdresaNumar);
        System.out.println(Varsta+" "+"ani");
        System.out.println(Greutate+" "+"kg");
        System.out.println(Experienta+" "+"ani");
    }

@Test

    public void PlatesteTaxa(){

        Nume = "Botareanu";
        Prenume = "Radu";
        //Declaram si initializam o variabila locala.
//        float Taxa = %.3f(2.550);
        System.out.println("Cursantul cu numele si prenumele" + ":" + " " + Nume + " " + Prenume + " " + "a achitat suma de "+ String.format("%.3f", 2.550)+" lei.");

    }

public void CalculeazaSuma(){
        //declaram 3 variabile care, adunate, sa insumeze 100
    Integer Suma=0;
    Integer Valoarea1=30;
    Integer Valoarea2=30;
    Integer Valoarea3=40;
    Suma=Valoarea1+Valoarea2+Valoarea3;
    System.out.println("Suma celor 3 variable este "+Suma+".");

}
public Double getSalariu(){
        Double Salariu=1.800;
        return Salariu;
}

public String getAdresa(){
        String Adresa="Strada Sub Cetate";
        return Adresa;
}
}
