package com.alphatrasporti.repository;

import com.alphatrasporti.constants.DBConstants;
import com.alphatrasporti.model.Fermata;
import com.alphatrasporti.model.Linea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LineaRepository {

    public static List<Linea> selezionaAllLinee() {
        List<Linea> lineaList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PPW); //credenziali d'accesso del database e sono universali //ci connettiamo al DB
            String query = "SELECT * FROM LINEA"; //"SELECT * FROM BIGLIETTERIA WHERE INDIRIZZO BIGLIETTERIA etc...
            PreparedStatement statement = connection.prepareStatement((query)); //per eseguire il comando SELECT(la nostra query)
            ResultSet rs = statement.executeQuery(); //lista iterabile; rs è iterabile e ha il metodo next => il risultato va messo nella struttura dati ResultSet;iterabile
            //con il suo metodo next e l'istanza è rs
            while (rs.next()) {
                Linea l = new Linea(
                        rs.getInt("ID_LINEA"), //nomi delle colonne delle tabelle
                        rs.getString("NOME_LINEA")
                );
                lineaList.add(l);
            }
            return lineaList; //se tutto va bene ritorna questo
        } catch (SQLException ex)  //Anche solo Exception va bene
        {
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();

    }
}
