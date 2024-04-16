package com.esempioesame.repository;

import com.esempioesame.Model.Fermate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.esempioesame.constants.DbConfig.*;

public class FermateRepository {


    public static List<Fermate> getFermate() {
        List<Fermate> fermate = new ArrayList<>();
        try{

            //è come una findAll manuale
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select Id, Nome_Fermata, Zona from fermate");//deve essere uguale alla tabella
            ResultSet rs = stmt.executeQuery(); //esecuzione query
            while(rs.next()){

                // creo una fermata con i dati del DB
                //nel while fa una nuova new fermata
                Fermate fermata = new Fermate(rs.getInt("Id"),rs.getString("Nome_Fermata"),rs.getString("Zona"));
                // aggiungo alla lista
                fermate.add(fermata);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fermate;
    }




}