package phase1.modele;

import java.util.ArrayList;

public class Enseignant {

    private String grade;
    private String nom;
    private String prenom;
    private String email;

    private int id;
    private Departement departement;
ArrayList <Module> modules=new ArrayList<>();

    public Enseignant() {
    }

    public Enseignant(int id, String nom, String prenom, String email, String grade) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.grade = grade;
        this.id=id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public boolean equals(Enseignant objt) {
        if (objt == null) return false;
        else if (objt.getId() != this.id) return false;
        else
            return true;
    }


}