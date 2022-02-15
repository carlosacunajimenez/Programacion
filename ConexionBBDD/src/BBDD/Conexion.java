package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            // here sonoo is database, root is username+passwd
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");

            // Crea un objeto Statement para enviar sentencias SQL a la base de datos
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from emp");

            while (rs.next()) {

                System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3));
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }

    }

}