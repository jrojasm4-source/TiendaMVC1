package com.tienda.dao;

import com.tienda.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    public List<Producto> listar() {

        List<Producto> lista = new ArrayList<>();

        Producto p1 = new Producto();
        p1.setId(1);
        p1.setNombre("Laptop Gamer");
        p1.setDescripcion("Laptop Core i7");
        p1.setPrecio(3500000);
        p1.setStock(5);
        p1.setFoto("laptop.jpg");
        p1.setActivo(true);

        Producto p2 = new Producto();
        p2.setId(2);
        p2.setNombre("Mouse Gamer");
        p2.setDescripcion("Mouse RGB");
        p2.setPrecio(80000);
        p2.setStock(20);
        p2.setFoto("mouse.jpg");
        p2.setActivo(true);

        Producto p3 = new Producto();
        p3.setId(3);
        p3.setNombre("Teclado Mecánico");
        p3.setDescripcion("Teclado RGB");
        p3.setPrecio(150000);
        p3.setStock(10);
        p3.setFoto("teclado.jpg");
        p3.setActivo(true);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        return lista;
    }

    public Producto buscarPorId(int id) {

        for (Producto p : listar()) {

            if (p.getId() == id) {
                return p;
            }

        }

        return null;
    }

    public boolean guardar(Producto producto) {

        System.out.println("Producto guardado: " +
                producto.getNombre());

        return true;
    }

    public boolean actualizar(Producto producto) {

        System.out.println("Producto actualizado: " +
                producto.getNombre());

        return true;
    }

    public boolean eliminar(int id) {

        System.out.println("Producto eliminado: " + id);

        return true;
    }
}