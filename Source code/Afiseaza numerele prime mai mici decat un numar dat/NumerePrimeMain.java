public class NumerePrimeMain {

    /**
     * Clasa afiseaza toate numerele prime mai mici decat un numar dat
     * Algoritmul de verificare se afla in clasa NumerePrimeAlgoritm
     *
     * @author Bogdan Panea
     * @version 1.0
     * @since 2018-10-29
     */

    public static void main(String... args) {

        NumerePrimeAlgoritm detectorNumerePrime = new NumerePrimeAlgoritm(args);
        detectorNumerePrime.gasesteNumerele();
        detectorNumerePrime.afiseazaNumerele();
    }


}
