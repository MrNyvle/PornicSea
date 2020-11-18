import java.util.ArrayList;

public class Collection<E> extends ArrayList<E> {


    public int cardinal(){

        return this.size();

    }

    public E obtenirObjet(int unIndex){

        return this.get(unIndex);

    }

    public void ajouter(E unObjet){

        this.add(unObjet);

    }

}
