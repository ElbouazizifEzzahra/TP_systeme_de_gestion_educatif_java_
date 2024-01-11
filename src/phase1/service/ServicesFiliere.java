package phase1.service;

import phase1.modele.Departement;
import phase1.modele.Enseignant;
import phase1.modele.Filiere;

import java.util.ArrayList;
public class ServicesFiliere {





        public static Filiere addFiliere(String intitule, Enseignant chef, Departement dept ) {
        Filiere filiere=new Filiere();
        filiere.setIntitule(intitule);
        filiere.setChef(chef);
        filiere.setDepartement(dept);
        filiere.setId(BD.getFILID());
        /*filiere.setModules(module);*/
        BD.filieres.add(filiere);
        return  filiere;
        }

        public static Filiere updateFiliere(int id , String intitule, Enseignant chef, Departement dept ){

            for(Filiere filiere :BD.filieres) {
                if(filiere.getId()==id){
                    filiere.setIntitule(intitule);
                    filiere.setChef(chef);
                    filiere.setDepartement(dept);
                    filiere.setId(BD.getFILID());
                   /* filiere.setModules(module);*/
                  BD.filieres.add(filiere);
                  return filiere;

            }

        }return  new Filiere();

        }
        public static ArrayList<Filiere> deleteFiliereById(int id){
                BD.filieres.remove(getFiliereById(id));
                return  BD.filieres;
        }

        public static Filiere getFiliereById(int id)
        {for(Filiere filiere : BD.filieres){
        if(filiere.getId()==id){
            return filiere;
        }
    }
            return  new Filiere();
}

        public static ArrayList<Filiere> getAllFiliere(){

            return  BD.filieres;
        }
    }

