package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Multimi {
    @Test
    public void testAutomat(){
        multimiNumereArray();
        multimiNumereList();
        multimeValoriHashMap();
        multimiTariOrase();
    }

    public void multimiNumereArray(){

        Integer [] numere = new Integer[3];
        numere[0] = 5;
        numere[1] = 6;
        numere[2] = 7;
        for (Integer index = 0; index < numere.length; index++){

            System.out.println(numere[index]);
        }
    }

    public void multimiNumereList(){

        List<String> numere = new ArrayList<>();
        numere.add("5");
        numere.add("6");
        numere.add("7");
        for (Integer index = 0; index < numere.size(); index++) {

            System.out.println(numere.get(index));

        }
    }

    public void multimeValoriHashMap(){

        //HashMap functioneaza dupa logica key = value
        HashMap<String, String> obiecteDiferite = new HashMap<>();
        obiecteDiferite.put("fruct", "mar");
        obiecteDiferite.put("leguma", "morcov");
        obiecteDiferite.put("haina", "bluza");
        for (String key: obiecteDiferite.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + obiecteDiferite.get(key));
        }
        Object firstKey = obiecteDiferite.keySet().toArray()[0];
        Object valueForFirstKey = obiecteDiferite.get(firstKey);
        System.out.println("Prima cheie este " + firstKey.toString());
        System.out.println("Prima valoare este "+ valueForFirstKey.toString());
    }

    public void multimiTariOrase(){
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Iasi");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Valencia");
        oraseSpania.add("Bilbao");

        HashMap<String, List<String>> tariOrase = new HashMap<>();
        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Spania", oraseSpania);
        for (String key: tariOrase.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + tariOrase.get(key));
        }

    }
}
