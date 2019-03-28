public class CeaMaiMareCifraAlgoritm {

    private int cifraMaxima;
    private String numar;

    CeaMaiMareCifraAlgoritm(String[] s) {
        numar = s[0];
    }

    public void detecteazaCifra() {
        for (int i = 0; i < numar.length(); i++) {
            if (cifraMaxima < Character.getNumericValue(numar.charAt(i))) {
                cifraMaxima = Character.getNumericValue(numar.charAt(i));
            }
        }
    }

    public int getResult() {
        return cifraMaxima;
    }
}

