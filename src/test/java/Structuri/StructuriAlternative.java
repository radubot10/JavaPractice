package Structuri;

import org.junit.Test;

public class StructuriAlternative {

    //Doua tipuri de structuri = structuri alternative si repetitive.
    //Structura alternativa = if conditie then
    //                                    else
    //Nu este neaparat nevoie sa facem un else la if
    //Putem avea oricate if este nevoie

    @Test
    public void testAutomat(){
        verificaNumere();
        verificaNume("Alexandru","Alex");
        verificaNume("Gheorghe","Ilie");
        verificaNumereComplex(5,7);
        verificaNumereComplex(7,7);
        verificaNumereComplex(7,6);

    }

    //Verificam daca 5 e mai mare decat 3.
    public void verificaNumere(){
        if (5>3){
            System.out.println("5 e mai mare decat 3.");
        }
        else {
            System.out.println("5 este mai mic decat 3.");
        }
    }
    //Verificam daca Alexandru contine Alex.
    public void verificaNume(String nume1, String nume2){
        if(nume1.contains(nume2)){
            System.out.println(nume1+" contine "+nume2+".");

        } else {
            System.out.println(nume1+" nu contine "+nume2+".");
        }
    }


    //Verificam daca un numar este mai mare decat altul cu mai multe cazuri

    public void verificaNumereComplex(Integer nr1,Integer nr2){
        if(nr1>nr2){
            System.out.println(nr1+" e mai mare decat "+nr2+".");
        }
        if(nr1<nr2){
            System.out.println(nr1+" e mai mic decat "+nr2+".");
        }
        if(nr1==nr2){
            System.out.println(nr1+" e egal cu "+nr2+".");
        }
        if(nr1!=nr2){
            System.out.println(nr1+" e diferit de "+nr2+".");
        }
    }
}
