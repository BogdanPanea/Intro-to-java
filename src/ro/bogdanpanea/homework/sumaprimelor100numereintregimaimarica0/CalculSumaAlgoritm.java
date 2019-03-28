package ro.bogdanpanea.homework.sumaprimelor100numereintregimaimarica0;

public class CalculSumaAlgoritm {

    private int suma;

    public void calculeazaSuma() {
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
    }

    public int getResult() {
        return suma;
    }
}
