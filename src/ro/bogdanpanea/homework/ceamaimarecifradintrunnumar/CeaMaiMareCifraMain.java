package ro.bogdanpanea.homework.ceamaimarecifradintrunnumar;

public class CeaMaiMareCifraMain {

    /**
     * Clasa gaseste cifra cea mai mare dintr-un numar
     * Algoritmul de cautare este in clasa CeaMaiMareCifraAlgoritm
     *
     * @author Bogdan Panea
     * @version 1.0
     * @since 2018-10-29
     */

    public static void main(String... args) {

        int cifraCeaMaiMare;

        CeaMaiMareCifraAlgoritm detectorCifraMaxima = new CeaMaiMareCifraAlgoritm(args);
        detectorCifraMaxima.detecteazaCifra();
        cifraCeaMaiMare = detectorCifraMaxima.getResult();
        System.out.println("Cifra cea mai mare din numar este: " + cifraCeaMaiMare);
    }


}