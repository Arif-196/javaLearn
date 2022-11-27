/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.*;
/**
 *
 * @author NB-Arif
 */
public class ConnectionDB {
    Connection cn;
    public static Connection configDB(){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa", "root", "");
        return cn;
      }  catch (Exception e){
          System.err.println("Failed Connection! " + e.getMessage()); // Perintah menampilkan error pada koneksi
          return null;
      }

    }
}
