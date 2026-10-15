package com.tienda.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL =
            "jdbc:mariadb://localhost:3306/tienda_mvc_java";

    private static final String USER = "root";

    private static final String PASSWORD = "";

    public static Connection getConexion() {

        try {

            Connection cn =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("CONEXION EXITOSA");

            return cn;

        } catch (SQLException e) {

            System.out.println("CONEXION FALLIDA");
            e.printStackTrace();

            return null;
        }
    }
}