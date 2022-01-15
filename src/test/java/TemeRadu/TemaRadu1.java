package TemeRadu;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class TemaRadu1 {

    public String helloWorld = "Hello World";
    public Integer varstaMea = 30;
    public String nume = "Botareanu";
    public String prenume = "Radu";
    public String dataDeAzi = "Care e data de azi?";
    public LocalDate now = LocalDate.now();
    public LocalTime time = LocalTime.now();
    public DayOfWeek day = DayOfWeek.FRIDAY;
    public String catFaceOperatia = "Cat face operatia [2 + (3 * 4) - 3] / 3?";
    public Integer operatia = (2 + (3 * 4) - 3) / 3;
    public String rezultatul = "Rezultatul corect este " + operatia + "." + " Poti pleca acasa dupa ce iti verific munca!";
    public String operatieDoubles = "Cat face operatia (1.2 + 2.3 + 4.5)?";
    public Double operatia2 = 1.2 + 2.3 + 4.5;
    public String rezultatul2 = "Rezultatul operatiei 2 este " + operatia2 + "." + " Poti pleca acasa dupa ce iti verific munca!";
    public String inmultire = "Cat face operatia (6 * 7)?";
    public Integer operatia3 = 6 * 7;
    public String rezultatul3 = "Rezultatul operatiei 3 este " + operatia3 + "." + " Poti pleca acasa dupa ce iti verific munca!";
    public String concatenare1 = "Stiu ca am calculat bine " + operatia + ".";
    public String concatenare2 = "Stiu ca am calculat bine " + operatia2 + ".";
    public String concatenare3 = "Stiu ca am calculat bine " + operatia3 + ".";
    public String salut = "Salut" + "M";
    public String hello = "H" + "Hello";
    public String caracterulZ = "Ana" + "Z " + "are" + "Z " + "mere" + "Z, " + "pere" + "Z, " + "prune" + "Z.";

   @Test

    public void afisareDate(){

       System.out.println(helloWorld);
       System.out.println(varstaMea);
       System.out.println(nume);
       System.out.println(prenume);
       System.out.println(dataDeAzi);
       System.out.println(now);
       System.out.println(time);
       System.out.println(day);
       System.out.println(catFaceOperatia);
       System.out.println(rezultatul);
       System.out.println(operatieDoubles);
       System.out.println(rezultatul2);
       System.out.println(inmultire);
       System.out.println(rezultatul3);
       System.out.println(concatenare1);
       System.out.println(concatenare2);
       System.out.println(concatenare3);
       System.out.println(salut);
       System.out.println(hello);
       System.out.println(caracterulZ);
   }

}
