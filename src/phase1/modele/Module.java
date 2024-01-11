package phase1.modele;

public class Module {
    private int id;
    private String intitule;
    private Filiere filiere;
    private Enseignant chef;

    public Module() {
    }

    public Module(String intitule, Filiere filiere, Enseignant chef) {
        this.intitule = intitule;
        this.filiere = filiere;
        this.chef = chef;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Enseignant getChef() {
        return chef;
    }

    public void setChef(Enseignant chef) {
        this.chef = chef;
    }
}