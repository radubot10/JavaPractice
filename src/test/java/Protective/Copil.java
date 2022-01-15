package Protective;

public class Copil {

    // Public = vizibil peste tot in proiect.
    // Private = vizibil doar in clasa unde a fost declarat.
    // Protected = vizibil in clasa parinte + clasa copil indiferent daca se afla sau nu in acelasi pachet.
    // Default = vizibil in clasa parinte + clasa copil cu conditia sa fie in acelasi pachet.
    // Default = daca declaram un obiect, este vizibil in orice clasa din pachet.
    // Protected = daca declaram un obiect, este vizibil in orice clasa din pachet.

    public void metodaPublic(){
        System.out.println("Public");
    }
    private void metodaPrivate(){
        System.out.println("Private");
    }
    protected void metodaProtected(){
        System.out.println("Protected");
    }
    void metodaDefault(){
        System.out.println("Default");
    }
}
