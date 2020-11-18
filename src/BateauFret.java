public class BateauFret extends Bateau {

    private float poidsmaxBatFret;

    public BateauFret(float poidsmaxBatFret) {
        this.poidsmaxBatFret = poidsmaxBatFret;
    }

    public BateauFret(int prmIDBat, String prmNomBat, int prmLongueurBat, int prmLargeurBat, float poidsmaxBatFret) {
        super(prmIDBat, prmNomBat, prmLongueurBat, prmLargeurBat);
        this.poidsmaxBatFret = poidsmaxBatFret;
    }

    public float getPoidsmaxBatFret() {
        return poidsmaxBatFret;
    }

    public void setPoidsmaxBatFret(float poidsmaxBatFret) {
        this.poidsmaxBatFret = poidsmaxBatFret;
    }
}
