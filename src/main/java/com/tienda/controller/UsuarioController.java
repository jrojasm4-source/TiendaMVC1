/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.dao.UsuarioDAO;

public class UsuarioController {

    private UsuarioDAO dao = new UsuarioDAO();

    public boolean login(String correo,String password){

        return dao.login(correo,password);

    }
}
