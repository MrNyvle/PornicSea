abstract public class Bateau {


    private int IDBat;
    private String NomBat;
    private int LongueurBat;
    private int LargeurBat;


    public Bateau(){};

    public Bateau(int prmIDBat, String prmNomBat, int prmLongueurBat, int prmLargeurBat) {
        this.IDBat = prmIDBat;
        this.NomBat = prmNomBat;
        this.LongueurBat = prmLongueurBat;
        this.LargeurBat = prmLargeurBat;
    }

    public int getIDBat() {
        return IDBat;
    }

    public String getNomBat() {
        return NomBat;
    }

    public int getLongueurBat() {
        return LongueurBat;
    }

    public int getLargeurBat() {
        return LargeurBat;
    }

    public void setIDBat(int IDBat) {
        this.IDBat = IDBat;
    }

    public void setNomBat(String nomBat) {
        this.NomBat = nomBat;
    }

    public void setLongueurBat(int longueurBat) {
        this.LongueurBat = longueurBat;
    }

    public void setLargeurBat(int largeurBat) {
        this.LargeurBat = largeurBat;
    }

    public String versChaine(){
        String SautLigne = System.getProperty("line.separator");
        return " Nom du bateau : " + this.NomBat + SautLigne +" Longueur : " + this.LongueurBat + " mètres" + SautLigne + "Largeur : " + this.LargeurBat + " mètres" + SautLigne;

    }
}
