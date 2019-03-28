package ro.bogdanpanea.homework.numarpalindrom;

public class NumarPalindromAlgoritm {

    private boolean palindrom = true;
    private String numar;

    NumarPalindromAlgoritm(String[] s) {
        numar = s[0];
    }

    public void detecteazaNumar() {
        int k = (int) (numar.length() / 2);
        for (int i = 0; i < k; i++) {
            int j = (numar.length() - 1) - i;
            if (Character.getNumericValue(numar.charAt(i)) != Character.getNumericValue(numar.charAt(j))) {
                palindrom = false;
            }
        }
    }

    public boolean getResult() {
        return palindrom;
    }
}
