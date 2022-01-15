package Structuri;

import org.junit.Test;

public class StructuriRepetitive {

    // Cele mai intalnite structuri repetitive: for si while

    @Test

    public void testAutomat(){
        // printamNumereFor();
        printamNumereWhile();

    }
    // Printam primele 200 de numere
    public void printamNumereFor(){
        for (Integer index = 1; index <= 200; index++) {

            System.out.println(index);
        }
    }

    public void printamNumereWhile(){
        int index = 1;
        while (index <=200){
            System.out.println(index);
            index++;
        }

    }
}




