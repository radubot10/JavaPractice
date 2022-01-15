package VariabilaMetoda;

import java.util.Scanner;
import org.junit.Test;


public class Exersare {

    Scanner scanner = new Scanner(System.in);
    public String nume;
    public Integer varstaPersoana;
    //Stiind ca primii mei doi ani de viata inseamna 10.5 ani de caine si urmatorii inseamna 4 ani, sa se calculeze varsta mea in dog years.
    public String numeCaine;
    public Integer varstaCaine;

   @Test
    public void Exersare(){

        numeCaine = "Banel";
//        System.out.println("Introduceti-va numele!");
//        nume = scanner.nextLine();
//        System.out.println("Introduceti-va varsta!");
//        varstaPersoana = Integer.parseInt(scanner.nextLine());
       nume = "Radu";
        Double primiiAni = 2 * 10.5;
//        Integer urmatoriiAni = (varstaPersoana - 2) * 4;
        Integer urmatoriiAni = (30 - 2) * 4;
        Double varstaCaine = primiiAni + urmatoriiAni;
        System.out.println(nume + ", acum imagineaza-ti ca esti " + numeCaine + "! Ai avea " + varstaCaine + " ani!");





    }
}