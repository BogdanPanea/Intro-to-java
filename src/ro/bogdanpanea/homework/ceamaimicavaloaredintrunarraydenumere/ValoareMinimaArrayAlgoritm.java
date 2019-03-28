package ro.bogdanpanea.homework.ceamaimicavaloaredintrunarraydenumere;

public class ValoareMinimaArrayAlgoritm {

    private double minim;
    private Double[] matriceNumere;

    ValoareMinimaArrayAlgoritm(String[] s) {
        matriceNumere = new Double[s.length];
        for (int i = 0; i < s.length; i++) {
            matriceNumere[i] = Double.parseDouble(s[i]);
        }

    }

    public void gasesteMinimul() {
        for (int i = 0; i < matriceNumere.length; i++) {
            if (matriceNumere[i] < minim) {
                minim = matriceNumere[i];
            }
        }
    }

    public double getResult() {
        return minim;
    }
}
