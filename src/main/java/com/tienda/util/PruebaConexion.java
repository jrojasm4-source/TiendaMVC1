package com.tienda.util;

import com.tienda.dao.UsuarioDAO;

public class PruebaConexion {

    public static void main(String[] args) {

        UsuarioDAO dao =
                new UsuarioDAO();

        System.out.println(
                "Conexion exitosa"
        );

    }
}
