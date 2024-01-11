package phase1;

import phase1.controleur.*;
import phase1.modele.Enseignant;
import phase1.service.BD;

import java.util.Scanner;
public class Main {




            public static boolean isNull(Object ob) {

                return ob == null ;
            }
            public static int getIntInput(String... msg) {
                Scanner scan = new Scanner(System.in);
                String message = "Entrez un nombre entier : ";
                if (msg.length > 0 )
                    message = msg[0] ;
                System.out.print(message);
                // This method reads the number provided using keyboardif(scan.hasNextInt())
                int num = scan.nextInt();
                // Closing Scanner after the use
                // scan.close();
                return num;
            }

            public static String getStringInput(String... msg) {
                Scanner scan = new Scanner(System.in);
                String message = "Entrez un texte : ";
                if (msg.length > 0 )
                    message = msg[0] ;
                System.out.print(message);

                // This method reads the number provided using keyboard
                String str = scan.nextLine();

                // Closing Scanner after the use
                scan.close();
                return str;
            }

            public static void showPrincipalMenu(){
                System.out.println("-------------------------[ Bienvenu ]---------------------------");


                System.out.println("1: Pour gérer les départements");
                System.out.println("2: Pour gérer les filières");
                System.out.println("3: Pour gérer les enseignants");
                System.out.println("4: Pour gérer les modules");
                System.out.println("5: Pour gérer les étudiants");
                System.out.println("0: Pour sortir");

                //"Veuillez sélectionner une option : ")
                int option = getIntInput("Veuillez sélectionner une option : ");
                switch(option) {
                    case 1:
                        ControlleurDepartemant.showMenu();
                        break;
                    case 2:
                        ControlleurFiliere.showMenu();
                        break;
                    case 3:
                       ControlleurEnseignant.showMenu();
                        break;
                    case 4:
                        ControlleurModule.showMenu();
                        break;
                    case 5:
                        ControlleurEtudiant.showEtudiants();
                        break;
                    default:
                        // code block
                }

            }
            public static void main(String[] args) {

                Enseignant enseignant = new Enseignant();
                enseignant.setNom("salma");
                enseignant.setPrenom("wardi");
                enseignant.setEmail("email@gmail.com");
                enseignant.setGrade("gg");
                enseignant.setId(BD.getEnsId());
                BD.enseignants.add(enseignant);
                showPrincipalMenu();
            }
        }