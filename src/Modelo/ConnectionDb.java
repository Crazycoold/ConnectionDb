/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class ConnectionDb {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    /*public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String name, email;
        DbMethods conexion = new DbMethods();
        conexion.connect();
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        name = Scanner.nextLine();
        System.out.println("Ingrese Email: ");
        email = Scanner.nextLine();
        ResultSet query = conexion.query("SELECT * FROM `users` where `email` = '" + email + "'");
        if (query.next()) {
            System.out.println("");
            System.out.println("Este Email ya existe");
        } else {
            conexion.save("INSERT INTO `users` (`id`, `name`, `email`, `email_verified_at`, `password`, `remember_token`, `created_at`, `updated_at`) VALUES (NULL, '" + name + "', '" + email + "', NULL, '$2y$10$9W/BYKIojt/zLugNKggg4OXOxbyKmotdPSDEbLhQU4A.yfis8biga', NULL, '2021-04-23 17:45:30', '2021-04-23 17:45:30')");
        }
        System.out.println("");
        ResultSet result = conexion.query("SELECT * FROM `users`");
        while (result.next()) {
            System.out.println("ID: " + result.getInt(1) + " NAME: " + result.getString(2) + " DATE: " + result.getString(7));
        }
        conexion.close();
    }*/
}
