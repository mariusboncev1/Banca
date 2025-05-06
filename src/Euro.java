public class Euro extends ContBancar implements SumaTotala {

    private double dobanda = 0.3;
    private int limitaMaxima = 500;
    private int limitaMinima = 0;

    public Euro(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public float getDobanda() {
        return (float)(getSuma() * dobanda);
    }

    @Override
    public float getSumaTotala() {
        return getSuma() + getDobanda();
    }
}