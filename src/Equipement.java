public class Equipement {

    private String IDEqui;
    private String libEqui;

    public Equipement(String prmIDEqui, String prmLibEqui) {
        this.IDEqui = prmIDEqui;
        this.libEqui = prmLibEqui;
    }

    public String getIDEqui() {
        return IDEqui;
    }

    public void setIDEqui(String IDEqui) {
        this.IDEqui = IDEqui;
    }

    public String getLibEqui() {
        return libEqui;
    }

    public void setLibEqui(String libEqui) {
        this.libEqui = libEqui;
    }

    public String versChaine(){

        return this.libEqui;

    }


}
