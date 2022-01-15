package MostenireIncapsulare;

import java.util.List;

public class Audi extends Masina {

    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;

    public Audi(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare, List<String> dotari, Integer pret, String model) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);
        this.culoare = culoare;
        this.dotari = dotari;
        this.pret = pret;
        this.model = model;
    }

    public void infoMasina(){
        System.out.println("Detaliile despre masina Audi model " + model+  " sunt urmatoarele:");
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
        System.out.println("Pretul final al masinii Audi model " + model + " este de " + pretFinal + " EUR.");
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "culoare='" + getCuloare() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", model='" + getModel() + '\'' +
                ", tipCaroserie='" + getTipCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                '}';
    }
}
