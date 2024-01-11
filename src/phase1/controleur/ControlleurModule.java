package phase1.controleur;
import phase1.modele.Module;
import phase1.service.*;
import phase1.Main;
public class ControlleurModule {

        public static void showMenu(){
            System.out.println("-------------------------[ Modules ]---------------------------");


            System.out.println("1: Pour ajouter un Module");
            System.out.println("2: Pour afficher les Modules");
            System.out.println("3: Pour modifier un Module");
            System.out.println("4: Pour supprimer un Module");
            System.out.println("0: Pour retourner au menu principal");

            //"Veuillez sélectionner une option : ")
            int option = Main.getIntInput("Veuillez sélectionner une option : ");
            switch(option) {
                case 1:
                    createModule();
                    break;
                case 2:
                    showModules();
                    break;
                case 3:
                    editModule();
                    break;
                case 4:
                    destroyModule();
                    break;
                default:
                    Main.showPrincipalMenu();
            }

        }
        public static void showModules(){
            for (Module module : BD.modules) {
                System.out.print("Id : " + module.getId() );
                System.out.print(" | Intitulé : " + module.getIntitule());
                System.out.print(" | filiere : " + module.getFiliere() );
                System.out.print(" | chef : " + module.getChef() );

                System.out.println("");
            }

        }
        public static void createModule(){

            String intitule = Main.getStringInput("Entrez l'intitulé :");
            ControlleurFiliere.showFilieres();
            int id = Main.getIntInput("Sélecionnez une filiere  par id :");
            ControlleurEnseignant.showEnseignants();
            int idid = Main.getIntInput("Sélecionnez un professeur/chef par id :");
          ServicesModule.addModule(intitule,ServicesEnsignant.getEnsById(idid),ServicesFiliere.getFiliereById(id));

            showModules();
            showMenu();

        }
        public static void editModule(){
            showModules();
            int id = Main.getIntInput("Sélecionnez un Module par id :");
            String intitule = Main.getStringInput("Entrez l'intitulé :");
            ControlleurFiliere.showFilieres();
            int idd = Main.getIntInput("Sélecionnez une filiere  par id :");
            ControlleurEnseignant.showEnseignants();
            int idid = Main.getIntInput("Sélecionnez un professeur/chef par id :");
            ServicesModule.updateModule(id,intitule,ServicesEnsignant.getEnsById(idid),ServicesFiliere.getFiliereById(idd));

            showModules();
            showMenu();

        }
        public static void destroyModule(){
            showModules();
            int id = Main.getIntInput("Sélecionnez un module par id :");
            ServicesModule.deleteModuleById(id);
            showModules();
        }
    }