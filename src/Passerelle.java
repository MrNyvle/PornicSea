import java.text.CollationElementIterator;
import java.util.ArrayList;

public class Passerelle {

    final static Collection<BateauVoyageur> lesBateaux = new Collection<BateauVoyageur>();

    public static ArrayList<Equipement> chargerLesEquipements (int unIdBateau) {



        if ((unIdBateau < lesBateaux.cardinal()) && (unIdBateau >= lesBateaux.cardinal())) {
            System.out.println("Id invalide");
            return null;
        }

        for (BateauVoyageur x : lesBateaux){
            if(x.getIDBat() == unIdBateau) {
                return x.getLesEquipement();
            }

        }

        System.out.println("Aucun bateau n'a cette ID");
        return null;
    }




    //public static ArrayList<BateauVoyageur> chargerLesBateauxVoyageurs(){

        // ici on va venir add a les bateau de la bdd "dbBat"dans les bateaux avec lesBateaux.ajouter("bateau de la bdd")
        // on a pas la bdd
        //jvais faire un truc je reviens après

    //}
}
