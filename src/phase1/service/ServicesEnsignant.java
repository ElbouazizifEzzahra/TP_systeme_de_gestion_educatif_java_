package phase1.service;



import phase1.modele.Departement;
import phase1.modele.Enseignant;

import java.util.ArrayList;

    public class ServicesEnsignant {

        public static Enseignant addEns(String nom, String prenom, String email, String grade, Departement dept  ){
         Enseignant enseignant =  new Enseignant();
         enseignant.setNom(nom);
         enseignant.setPrenom(prenom);
         enseignant.setGrade(grade);
         enseignant.setDepartement(dept);
         enseignant.setId(BD.getEnsId());
        /* enseignant.setModules(module);*/
         BD.enseignants.add(enseignant);
              return enseignant;
        }

        public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departement dept){
            for(Enseignant enseignant : BD.enseignants){
                if(enseignant.getId()==id)
                {enseignant.setNom(nom);
                enseignant.setPrenom(prenom);
                enseignant.setGrade(grade);
                enseignant.setDepartement(dept);
                enseignant.setId(BD.getEnsId());
            /*    enseignant.setModules(module);*/}
                return enseignant;
            }
            return new Enseignant();
        }


        public static Enseignant getEnsById(int id){
            for (Enseignant enseignant : BD.enseignants) {
                if (enseignant.getId() == id) return  enseignant;
            }
            return  new Enseignant();
        }

        public static ArrayList<Enseignant> deleteEnsById(int id){
            BD.enseignants.remove(getEnsById(id));
            return  BD.enseignants;
        }
    }

