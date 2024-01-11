package phase1.controleur;
import phase1.Main;
import phase1.modele.Etudiant;
import phase1.service.BD;
import phase1.service.ServicesEtudiant;
import phase1.service.ServicesFiliere;
public class ControlleurEtudiant {


        public static void showMenu(){
            System.out.println("-------------------------[ Etudiants ]---------------------------");


            System.out.println("1: Pour ajouter un Etudiant");
            System.out.println("2: Pour afficher les Etudiants");
            System.out.println("3: Pour modifier un Etudiant");
            System.out.println("4: Pour supprimer un Etudiant");
            System.out.println("0: Pour retourner au menu principal");

            //"Veuillez sélectionner une option : ")
            int option = Main.getIntInput("Veuillez sélectionner une option : ");
            switch(option) {
                case 1:
                    createEtudiant();
                    break;
                case 2:
                    showEtudiants();
                    break;
                case 3:
                    editEtudiant();
                    break;
                case 4:
                    destroyEtudiant();
                    break;
                default:
                    Main.showPrincipalMenu();
            }

        }
        public static void showEtudiants(){
            for (Etudiant etudiant : BD.etudiants) {
                System.out.print("Id : " + etudiant.getId() );
                System.out.print(" | Nom : " + etudiant.getNom() + " " + etudiant.getPrenom());
                System.out.print(" | Email : " + etudiant.getEmail() );
                System.out.print(" | Apogee : " + etudiant.getApogee() );
                System.out.print(" | filiere : " + etudiant.getFiliere() );

                System.out.println("");
            }

        }
        public static void createEtudiant(){
            String nom = Main.getStringInput("Entrez le nom :");
            String prenom = Main.getStringInput("Entrez le prenom :");
            String email = Main.getStringInput("Entrez l'email ' :");
            int apogee = Main.getIntInput("Entrez l'apogee :");
            ControlleurFiliere.showFilieres();
            int id = Main.getIntInput("Sélecionnez une filiere  par id :");
            ServicesEtudiant.addEtd(nom, prenom, email, apogee, ServicesFiliere.getFiliereById(id));

            showEtudiants();
            showMenu();
        }
        public static void editEtudiant(){
            showEtudiants();
            int id = Main.getIntInput("Sélecionnez un etudiant par id :");
            String nom = Main.getStringInput("Entrez le nom :");
            String prenom = Main.getStringInput("Entrez le prenom :");
            String email = Main.getStringInput("Entrez l'email ' :");
            int apogee = Main.getIntInput("Entrez l'apogee :");
            ControlleurFiliere.showFilieres();
            int idid = Main.getIntInput("Sélecionnez une filiere  par id :");
            ServicesEtudiant.updateEtd(id,nom,prenom,email,apogee,ServicesFiliere.getFiliereById(idid));

            showEtudiants();
            showMenu();

        }
        public static void destroyEtudiant(){
            showEtudiants();
            int id = Main.getIntInput("Sélecionnez un etudiant par id :");
            ServicesEtudiant.deleteEtdById(id);
            showEtudiants();

        }
    }