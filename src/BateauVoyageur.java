import java.util.ArrayList;

public class BateauVoyageur extends Bateau{


    private float vitesseBatVoy;
    private String immageBatVoy;
    private ArrayList<Equipement> lesEquipement;


    public BateauVoyageur(float vitesseBatVoy, String immageBatVoy, ArrayList<Equipement> lesEquipement) {
        this.vitesseBatVoy = vitesseBatVoy;
        this.immageBatVoy = immageBatVoy;
        this.lesEquipement = lesEquipement;
    }

    public BateauVoyageur(int prmIDBat, String prmNomBat, int prmLongueurBat, int prmLargeurBat, float vitesseBatVoy, String immageBatVoy, ArrayList<Equipement> lesEquipement) {
        super(prmIDBat, prmNomBat, prmLongueurBat, prmLargeurBat);
        this.vitesseBatVoy = vitesseBatVoy;
        this.immageBatVoy = immageBatVoy;
        this.lesEquipement = lesEquipement;

    }

    public float getVitesseBatVoy() {
        return vitesseBatVoy;
    }

    public void setVitesseBatVoy(float vitesseBatVoy) {
        this.vitesseBatVoy = vitesseBatVoy;
    }

    public String getImmageBatVoy() {
        return immageBatVoy;
    }

    public void setImmageBatVoy(String immageBatVoy) {
        this.immageBatVoy = immageBatVoy;
    }

    public ArrayList<Equipement> getLesEquipement() {
        return lesEquipement;
    }

    public void setLesEquipement(ArrayList<Equipement> lesEquipement) {
        this.lesEquipement = lesEquipement;
    }

    @Override
    public String versChaine() {
        String SautLigne = System.getProperty("line.separator");
        String Chaine = super.versChaine() + " Vitesse : " + this.vitesseBatVoy + SautLigne + versChaineEquipement();
        return Chaine;
    }

    public String versChaineEquipement(){


        String SautLigne = System.getProperty("line.separator");
        String EquipmementString=" Liste des équipements du bateau : " + SautLigne;

        for (Equipement Equipement:lesEquipement) {

            EquipmementString = EquipmementString + "- " + Equipement.versChaine() + SautLigne;

        }

        return EquipmementString;

    }

}