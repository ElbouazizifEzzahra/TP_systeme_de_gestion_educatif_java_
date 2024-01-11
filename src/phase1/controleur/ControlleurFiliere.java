package phase1.controleur;

import phase1.service.*;
import phase1.modele.Filiere;
import phase1.Main;
public class ControlleurFiliere {







                public static void showMenu(){
                    System.out.println("-------------------------[  Filières ]---------------------------");


                    System.out.println("1: Pour ajouter un Filière");
                    System.out.println("2: Pour afficher les Filières");
                    System.out.println("3: Pour modifier un Filière");
                    System.out.println("4: Pour supprimer un Filière");
                    System.out.println("0: Pour retourner au menu principal");

                    //"Veuillez sélectionner une option : ")
                    int option = Main.getIntInput("Veuillez sélectionner une option : ");
                    switch(option) {
                        case 1:
                            createFiliere();
                            break;
                        case 2:
                            showFilieres();
                            break;
                        case 3:
                            editFiliere();
                            break;
                        case 4:
                            destroyFiliere();
                            break;
                        default:
                            Main.showPrincipalMenu();
                    }

                }
                public static void showFilieres(){
                    for (Filiere filiere : BD.filieres) {
                        System.out.print("Id : " + filiere.getId() );
                        System.out.print(" | Intitulé : " + filiere.getIntitule());
                        System.out.print(" | chef : " + filiere.getChef() );
                        System.out.print(" | Departement : " + filiere.getDepartement() );

                        System.out.println("");
                    }


                }
                public static void createFiliere(){
                    String intitule = Main.getStringInput("Entrez l'intitulé :");
                    ControlleurEnseignant.showEnseignants();
                    int id = Main.getIntInput("Sélecionnez un responsable/chef par id :");
                   ControlleurDepartemant.showDepartements();
                    int idid = Main.getIntInput("Sélecionnez un departement  par id :");
                    ServicesFiliere.addFiliere(intitule,ServicesEnsignant.getEnsById(id),ServicesDepartemant.getDeptById(idid));


                    showFilieres();
                    showMenu();

                }
                public static void editFiliere(){
                    showFilieres();
                    int id = Main.getIntInput("Sélecionnez une filiere par id :");
                    String intitule = Main.getStringInput("Entrez l'intitulé :");
                    ControlleurEnseignant.showEnseignants();
                    int idi = Main.getIntInput("Sélecionnez un responsable/chef par id :");
                  ControlleurDepartemant.showDepartements();
                    int id2 = Main.getIntInput("Sélecionnez un departement  par id :");
                   ServicesFiliere.updateFiliere(id,intitule,ServicesEnsignant.getEnsById(idi),ServicesDepartemant.getDeptById(id2));
                    showFilieres();
                    showMenu();
                }
                public static void destroyFiliere(){
                    showFilieres();
                    int id = Main.getIntInput("Sélecionnez une filiere par id :");
                    ServicesFiliere.deleteFiliereById(id);
                    showFilieres();

                }
            }