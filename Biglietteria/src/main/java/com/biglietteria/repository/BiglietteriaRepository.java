package com.biglietteria.repository;

import com.biglietteria.model.Biglietteria;
import com.biglietteria.constants.DbConfig;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BiglietteriaRepository {

    public static List<Biglietteria> selezionaBiglietterie() {

        List<Biglietteria> biglietteriaList = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection(DbConfig.URL,DbConfig.USER, DbConfig.PPW); //credenziali d'accesso del database e sono universali //ci connettiamo al DB
            String query = "SELECT * FROM BIGLIETTERIA"; //"SELECT * FROM BIGLIETTERIA WHERE INDIRIZZO BIGLIETTERIA etc...
            PreparedStatement statement = connection.prepareStatement((query)); //per eseguire il comando SELECT(la nostra query)
            ResultSet rs = statement.executeQuery(); //lista iterabile; rs è iterabile e ha il metodo next => il risultato va messo nella struttura dati ResultSet;iterabile
            //con il suo metodo next e l'istanza è rs
            while(rs.next())  {
                Biglietteria b = new Biglietteria(
                        rs.getString("CODICE_BIGLIETTERIA"), //nomi delle colonne delle tabelle
                        rs.getString("INDIRIZZO_BIGLIETTERIA"),
                        rs.getString("NOME_BIGLIETTERIA")

                );
                biglietteriaList.add(b);
            }
            return biglietteriaList; //se tutto va bene ritorna questo
        }
  catch (SQLException ex)  //Anche solo Exception va bene
        {
            System.out.println(ex.getMessage());
        }
     return new ArrayList<>();

    }
}