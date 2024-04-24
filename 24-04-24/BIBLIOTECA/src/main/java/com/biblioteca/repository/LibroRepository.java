package com.biblioteca.repository;

import com.biblioteca.constants.DbConfig;
import com.biblioteca.model.Libro;
//fare una select where e magari inserire un utente che noleggia un libro
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroRepository {
    public static List<Libro> selezionaTuttiLibri() {
        List<Libro> LibroList= new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DbConfig.URL, DbConfig.USER, DbConfig.PPW); //credenziali d'accesso del database e sono universali //ci connettiamo al DB
            String query = "SELECT * FROM LIBRO";
            PreparedStatement statement = connection.prepareStatement((query)); //per eseguire il comando SELECT(la nostra query)
            ResultSet rs = statement.executeQuery(); //lista iterabile; rs è iterabile e ha il metodo next => il risultato va messo nella struttura dati ResultSet;iterabile
            //con il suo metodo next e l'istanza è rs
            while (rs.next()) {
                Libro l = new Libro(
                        rs.getString("CODICE_ISBN"),
                        rs.getString("TITOLO"),
                        rs.getString("GENERE"),
                        rs.getString("ANNO_PUBBLICAZIONE"),
                        rs.getString("AUTORE")

                );
                LibroList.add(l);
            }
            return LibroList; //se tutto va bene ritorna questo
        } catch (SQLException ex)  //Anche solo Exception va bene
        {
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();

    }

    //Metodo per inserire un nuovo libro nel DB
    public static void inserisciLibro(Libro libro) {
        try {
            Connection connection = DriverManager.getConnection(DbConfig.URL, DbConfig.USER, DbConfig.PPW);
            String query = "INSERT INTO BIBLIOTECA(CODECE_ISBN, TITOLO, GENERE, ANNO_PUBBLICAZIONE, AUTORE)" +
                   "VALUES(?,?,?,?)" ;
            PreparedStatement statement = connection.prepareStatement((query));
            statement.setString(1, libro.getCodiceIsbn());
            statement.setString(2, libro.getTitolo());
            statement.setString(3, libro.getGenere());
            statement.setString(4, libro.getAnno_pubblicazione());

            statement.executeUpdate();
            System.out.println("Libro inserito");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
