/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlled;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Guga
 */
public class Behavior {
    
    private Connection con;
    private Behavior(){
        String url = "jdbc:mysql://localhost/java1pexamen";
        try {
            con = DriverManager.getConnection(url,"root","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder{
        private static Behavior SINGLETON = new Behavior();
    }
    
    public static Behavior getIstantace(){
        return SingletonHolder.SINGLETON;
    }
    
    public void addPerson(String nume, int age){
        String sql = "INSERT INTO person VALUES(null, ?, ?)";
        try (
                PreparedStatement stm = con.prepareStatement(sql);
                ){
            stm.setString(1, nume);
            stm.setInt(2, age);
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
        
}

