package com.biblioteca.repository;

import com.biblioteca.constants.DbConfig;
import com.biblioteca.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteRepository {

        public static List<Utente> selezionaTuttiUtenti() {
            List<Utente> UtenteList= new ArrayList<>();
            try {
                Connection connection = DriverManager.getConnection(DbConfig.URL, DbConfig.USER, DbConfig.PPW); //credenziali d'accesso del database e sono universali //ci connettiamo al DB
                String query = "SELECT * FROM UTENTE";
                PreparedStatement statement = connection.prepareStatement((query)); //per eseguire il comando SELECT(la nostra query)
                ResultSet rs = statement.executeQuery(); //lista iterabile; rs è iterabile e ha il metodo next => il risultato va messo nella struttura dati ResultSet;iterabile
                //con il suo metodo next e l'istanza è rs
                while (rs.next()) {
                    Utente u = new Utente(
                            rs.getString("CODICE_UTENTE"),
                            rs.getString("NOME"),
                            rs.getString("COGNOME")


                    );
                    UtenteList.add(u);
                }
                return UtenteList; //se tutto va bene ritorna questo
            } catch (SQLException ex)  //Anche solo Exception va bene
            {
                System.out.println(ex.getMessage());
            }
            return new ArrayList<>();

        }
    }

