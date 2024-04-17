package com.alphatrasporti.repository;

import com.alphatrasporti.constants.DBConstants;
import com.alphatrasporti.model.Fermata;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FermataRepository {
    public static List<Fermata> selezionaAllFermate() {
        List<Fermata> fermataList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PPW); //credenziali d'accesso del database e sono universali //ci connettiamo al DB
            String query = "SELECT * FROM FERMATA"; //"SELECT * FROM BIGLIETTERIA WHERE INDIRIZZO BIGLIETTERIA etc...
            PreparedStatement statement = connection.prepareStatement((query)); //per eseguire il comando SELECT(la nostra query)
            ResultSet rs = statement.executeQuery(); //lista iterabile; rs è iterabile e ha il metodo next => il risultato va messo nella struttura dati ResultSet;iterabile
            //con il suo metodo next e l'istanza è rs
            while (rs.next()) {
                Fermata f = new Fermata(
                        rs.getInt("ID_FERMATA"), //nomi delle colonne delle tabelle
                        rs.getString("NOME_FERMATA"),
                        rs.getString("ZONA")

                );
                fermataList.add(f);
            }
            return fermataList; //se tutto va bene ritorna questo
        } catch (SQLException ex)  //Anche solo Exception va bene
        {
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();

    }
}
