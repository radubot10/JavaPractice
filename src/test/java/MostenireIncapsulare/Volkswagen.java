package MostenireIncapsulare;

import java.util.List;

public class Volkswagen extends Masina {

    public String culoare;
    public List<String> dotari;
    public Integer pret;
    public String model;
    public String motorizare;

    public Volkswagen(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari, Integer pret, String model, String motorizare) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);
        this.culoare = culoare;
        this.dotari = dotari;
        this.pret = pret;
        this.model = model;
        this.motorizare = motorizare;
    }

    public void infoMasina(){
        System.out.println("Detaliile despre masina Volkswagen model " + model+  " sunt urmatoarele:");
        System.out.println(toString());
    }

    public void pretFinal(){
        Integer pretFinal = pret;
        Integer index = 0;
        while (index < dotari.size()){
            if(dotari.get(index).equals("interior piele")) {
                pretFinal = pretFinal + 1000;
            }
            if(dotari.get(index).equals("volan incalzit")) {
                pretFinal = pretFinal + 500;
            }
            if(dotari.get(index).equals("ventilatie scaune")) {
                pretFinal = pretFinal + 1000;
            }
            if(dotari.get(index).equals("trapa panoramica")) {
                pretFinal = pretFinal + 1000;
            }
            if(dotari.get(index).equals("masaj scaune")) {
                pretFinal = pretFinal + 1000;
            }
            if(dotari.get(index).equals("ACC")) {
                pretFinal = pretFinal + 1000;
            }
            if(dotari.get(index).equals("display tetiere")) {
                pretFinal = pretFinal + 3000;
            }
            if(dotari.get(index).equals("roti multidirectionale")) {
                pretFinal = pretFinal + 15000;
            }
            index++;
        }
        System.out.println("Pretul final al masinii Volkswagen model " + model + " este de " + pretFinal + " EUR.");
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "tipCaroserie='" + getTipCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                ", culoare='" + culoare + '\'' +
                ", dotari=" + dotari +
                ", pret=" + pret +
                ", model='" + model + '\'' +
                ", motorizare='" + motorizare + '\'' +
                '}';
    }

}