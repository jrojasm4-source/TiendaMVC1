/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.modelo.ItemCarrito;
import java.util.ArrayList;
import java.util.List;

public class CarritoController {

    private List<ItemCarrito> carrito =
            new ArrayList<>();

    public void agregar(ItemCarrito item){

        carrito.add(item);

    }

    public List<ItemCarrito> listar(){

        return carrito;

    }

    public void vaciar(){

        carrito.clear();

    }
}
