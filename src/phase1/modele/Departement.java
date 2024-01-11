package phase1.modele;

import java.util.ArrayList;

public class Departement {
    private int id;

    private String intitule;
    private Enseignant chef;
    ArrayList<Filiere> filieres = new ArrayList<>();

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule_dep) {
        this.intitule = intitule_dep;
    }

    public Enseignant getChef() {
        return chef;
    }

    public void setChef(Enseignant chef) {
        this.chef = chef;
    }

    public Departement() {

    }

    public Departement(String intitule, Enseignant chef) {

        this.intitule = intitule;
        this.chef = chef;
    }

    public int getId() {
        return id;
    }

    public void setId(int id_dep) {
        this.id = id;
    }

    public ArrayList<Filiere> getFilieres() {
        return filieres;
    }

    public void setFiliers(ArrayList<Filiere> filieres) {
        this.filieres = filieres;
    }

}