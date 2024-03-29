package phase1;
import phase1.modele.Enseignant;
import phase1.service.BD;
import java.sql.*;
public class testcnx {

        public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/tpjava";
            String user = "root";
            String pwd = "";
            try {
                Connection cx = DriverManager.getConnection(url, user, pwd);
                System.out.println("Good Connection");
                String req1 = "CREATE TABLE IF NOT EXISTS Enseignant (\n" +
                        "idEns INT AUTO_INCREMENT PRIMARY KEY, \n" +
                        "nom VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                        "prenom VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                        "email VARCHAR(50) CHARACTER SET utf8 NULL, \n" +
                        "grade VARCHAR(50) CHARACTER SET utf8 NULL)";
                ;

                try (Statement smt = cx.createStatement()) {
                    smt.executeUpdate(req1);
                    System.out.println("Un nouveau tableau 'Enseig' a été créé avec succès.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                System.out.println("Bad Connection");
                e.printStackTrace();
            }
        }


        public static void insertEnseigant(Enseignant enseignant, Connection cx) throws SQLException {
            String query = "INSERT INTO Enseignant (idens,nom,prenom,email,grade) values (?,'Fatima',?,?,?,?)";

            PreparedStatement ps = cx.prepareStatement(query);

            ps.setInt(1, BD.getEnsId());
            ps.setString(2, enseignant.getNom());
            ps.setString(3, enseignant.getPrenom());
            ps.setString(4, enseignant.getEmail());
            ;
            ps.setString(5, enseignant.getGrade());

        }


        public static void deleteEnseignant(int id, Connection cx) throws SQLException {
            String query = "DELETE  from Enseignant where id = ?";
            PreparedStatement ps = cx.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();


        }

        public static void updateEnseignant(int idEns, String Nom, String prenom, String email, String grade, Connection cx) throws SQLException {
            String query = "UPDATE Enseignant SET Nom = ?, Prenom = ?,email=?,grade=? WHERE idEns = ?";
            PreparedStatement ps = cx.prepareStatement(query);
            ps.setInt(1, idEns);
            ps.setString(2, Nom);
            ps.setString(3, prenom);
            ps.setString(4, email);
            ps.setString(5, grade);

            ps.executeUpdate();
        }
    }

