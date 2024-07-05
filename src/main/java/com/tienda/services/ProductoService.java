/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Producto;

import java.util.List;


public interface ProductoService {
   //se obtiene los registros de la tabala producto en un arrayList
    //de objetos Producto, todos o solo los activos
    
    public List<Producto> getCtegorias(boolean activos);
    
    
    //Recupera el redisto de la tabla producto en un objeto producto
    // si el id producto existe.. sino devuelve null
    
    public Producto getProducto(Producto producto);
    
    //Actualiza un registro en la tabla producto existe
    //Crea un registro en la tabla producto si idProducto no tiene valor
    
    public void save(Producto producto);
    
    //Elimina el registro de la tabla producto si idProducto existe en la
    public void delete(Producto producto);
    
}
    
    
    
   