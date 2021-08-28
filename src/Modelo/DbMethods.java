/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;

/**
 *
 * @author juand
 */
public class DbMethods {

    private Connection conexion;
    private Statement statement;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
            statement = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            Logger.getLogger(DbMethods.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet query(String sql) throws SQLException {
        return statement.executeQuery(sql);
    }

    public int save(String sql) throws SQLException {
        int n = statement.executeUpdate(sql);
        return n;
    }

    public void close() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
