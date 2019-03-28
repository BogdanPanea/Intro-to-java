package ro.bogdanpanea.homework.afiseazanumereleprimemaimicidecatunnumardat;
import java.util.ArrayList;

public class NumerePrimeAlgoritm {

    private int numar;
    private ArrayList<Integer> numerePrime = new ArrayList<Integer>();

    NumerePrimeAlgoritm(String[] s) {
        numar = Integer.parseInt(s[0]);
    }

    public boolean detecteazaNumarPrim(int m) {
        boolean prim = true;
        int k = (int) (m / 2);
        for (int i = 2; i <= k; i++) {
            if ((m % i) == 0) {
                prim = false;
            }
        }
        return prim;
    }

    public ArrayList<Integer> gasesteNumerele() {
        for (int i = 1; i < numar; i++) {
            if (detecteazaNumarPrim(i)) {
                numerePrime.add(i);
            }
        }
         return numerePrime;
    }
    public void afiseazaNumerele() {
        for (int i = 0; i < numerePrime.size(); i++) {
            System.out.println(numerePrime.get(i));
        }
    }


}