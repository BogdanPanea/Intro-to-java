public class NumarPalindromMain {

    /**
     * Clasa verifica daca un numar este palindrom
     * Algoritmul de verificare se afla in clasa NumarPalindromAlgoritm
     *
     * @author Bogdan Panea
     * @version 1.0
     * @since 2018-10-29
     */

    public static void main(String... args) {

        boolean palindrom;
        String statutNumar;

        NumarPalindromAlgoritm detectorPalindrom = new NumarPalindromAlgoritm(args);
        detectorPalindrom.detecteazaNumar();
        palindrom = detectorPalindrom.getResult();
        if (palindrom == true) {
            statutNumar = "este palindrom.";
        } else {
            statutNumar = "nu este palindrom.";
        }
        System.out.println("Numarul " + args[0] + " " + statutNumar);
    }


}