package phase1.service;

import phase1.modele.Etudiant;
import phase1.modele.Filiere;

import java.util.ArrayList;
public class ServicesEtudiant {





        public static Etudiant addEtd(String nom, String prenom, String email, int apogee, Filiere filiere){
            Etudiant etudiant = new Etudiant();
            etudiant.setNom(nom);
            etudiant.setPrenom(prenom);
            etudiant.setApogee(apogee);
            etudiant.setEmail(email);
            etudiant.setFiliere(filiere);
            etudiant.setId(BD.getETDID());
            BD.etudiants.add(etudiant);
           return etudiant;
        }

        public static Etudiant updateEtd(int id,String nom, String prenom, String email, int apogee, Filiere filiere) {
            for (Etudiant etudiant : BD.etudiants) {
                if (etudiant.getId() == id) {
                    etudiant.setNom(nom);
                    etudiant.setPrenom(prenom);
                    etudiant.setEmail(email);
                    etudiant.setFiliere(filiere);
                    etudiant.setApogee(apogee);

                    return etudiant;
                }}

                return new Etudiant();
            }


        public static ArrayList<Etudiant> deleteEtdById(int id){
                BD.etudiants.remove(getEtdById(id));
            return  BD.etudiants;
        }

        public static Etudiant getEtdById(int id){
                for(Etudiant etudiant : BD.etudiants){
                    if(etudiant.getId()==id){
                        return etudiant;
                    }
                }
            return  new Etudiant();
            }




    }

