public class CalculSumaMain {

    /**
     * Clasa calculeaza suma primelor 100 de numere intregi mai mari ca 0
     * Algoritmul de calcul se afla in clasa CalculSumaAlgoritm
     *
     * @author Bogdan Panea
     * @version 1.0
     * @since 2018-10-29
     */

    public static void main(String... args) {

        int sumaNumere;

        CalculSumaAlgoritm calculatorSuma = new CalculSumaAlgoritm();
        calculatorSuma.calculeazaSuma();
        sumaNumere = calculatorSuma.getResult();
        System.out.println("Suma primelor 100 de numere intregi mai mari ca 0 este: " + sumaNumere);
    }


}