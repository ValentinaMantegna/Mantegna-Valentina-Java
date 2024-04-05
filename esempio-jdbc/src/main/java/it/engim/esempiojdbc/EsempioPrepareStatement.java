package it.engim.esempiojdbc;

import java.sql.*;

public class EsempioPrepareStatement {



        static final String DB_URL = "jdbc:mysql://localhost/java";
        static final String USER = "java";
        static final String PASS = "java";
        static final String QUERY = "SELECT id, anno_pubblicazione, autore, titolo FROM libro";

    /*    public static void main(String[] args) {
            // Open a connection
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                //qui si cambia la QUERY
                //QUERY = "Select * from utenti where email = '" + qualcosa.getEmail() +
                //"' and password = " + qualcosa.getPassword(); => non è sicuro
                ResultSet rs = stmt.executeQuery(QUERY);) {
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    System.out.print("id: " + rs.getInt("id"));
                    System.out.print(", anno_pubblicazione: " + rs.getInt("anno_pubblicazione"));
                    System.out.print(", autore: " + rs.getString("autore"));
                    System.out.println(", titolo: " + rs.getString("titolo"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

        public static void main(String[] args) {
            // Open a connection
            PreparedStatement pstmt = null;
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                String SQL = "SELECT id, anno_pubblicazione, autore, titolo, FROM libro where autore = ? and anno > ?";
                pstmt = conn.prepareStatement(SQL);
                pstmt.setInt(1, 1000);
                pstmt.setString(2, "LGabriel García Márquez");
                pstmt.setString(3, "L'amore ai tempi del colera");


                ResultSet rs = pstmt.executeQuery();
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    System.out.print("id: " + rs.getInt("id"));
                    System.out.print(", anno_pubblicazione: " + rs.getInt("anno_pubblicazione"));
                    System.out.print(", autore: " + rs.getString("autore"));
                    System.out.println(", titolo: " + rs.getString("titolo"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}

