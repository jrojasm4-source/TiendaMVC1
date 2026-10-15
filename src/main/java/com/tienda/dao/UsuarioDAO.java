package com.tienda.dao;

import com.tienda.config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public boolean login(String correo, String password) {

        boolean acceso = false;

        try {

            String sql = "SELECT * FROM usuarios WHERE email=? AND password=?";

            con = Conexion.getConexion();

            ps = con.prepareStatement(sql);

            ps.setString(1, correo);
            ps.setString(2, password);

            rs = ps.executeQuery();

            if (rs.next()) {
                acceso = true;
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return acceso;
    }
}