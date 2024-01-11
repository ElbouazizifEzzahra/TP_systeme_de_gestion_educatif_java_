package phase1.modele;
import java.util.ArrayList;
public class Filiere {
    private int id;
    private String intitule;
    private Enseignant chef;


    private Departement departement;
  public  ArrayList<Module> modules = new ArrayList<>();

public Filiere(){}

    public Filiere(String intitule, Enseignant chef, Departement departement) {
        this.intitule = intitule;
        this.chef = chef;
        this.departement = departement;
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

    public Enseignant getChef() {
        return chef;
    }

    public void setChef(Enseignant chef) {
        this.chef = chef;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
