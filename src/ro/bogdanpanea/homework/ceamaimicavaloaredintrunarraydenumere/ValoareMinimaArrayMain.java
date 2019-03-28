package ro.bogdanpanea.homework.ceamaimicavaloaredintrunarraydenumere;

public class ValoareMinimaArrayMain {

    /**
     * Clasa calculeaza minimul unui array de numere
     * Algoritmul de calcul se afla in clasa ValoareMaximaArrayAlgoritm
     * @author Bogdan Panea
     * @version 1.0
     * @since   2018-10-29
     */

    public static void main(String... args) {

        double valoareMinimaArray;

        ValoareMinimaArrayAlgoritm detectorMinim = new ValoareMinimaArrayAlgoritm(args);
        detectorMinim.gasesteMinimul();
        valoareMinimaArray = detectorMinim.getResult();
        System.out.println("Valoarea minima din matrice este: " + valoareMinimaArray);
    }
}