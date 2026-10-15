package com.tienda.controller;

public class AuthController {

    public boolean autenticar(
            String correo,
            String password){

        UsuarioController uc =
                new UsuarioController();

        return uc.login(
                correo,
                password
        );
    }
}