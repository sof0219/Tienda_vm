/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Categoria;

import java.util.List;


public interface CategoriaService {
   //se obtiene los registros de la tabala categoria en un arrayList
    //de objetos Categoria, todos o solo los activos
    
    public List<Categoria> getCtegorias(boolean activos);
    
    
    //Recupera el redisto de la tabla categoria en un objeto categoria
    // si el id categoria existe.. sino devuelve null
    
    public Categoria getCategoria(Categoria categoria);
    
    //Actualiza un registro en la tabla categoria existe
    //Crea un registro en la tabla categoria si idCategoria no tiene valor
    
    public void save(Categoria categoria);
    
    //Elimina el registro de la tabla categoria si idCategoria existe en la
    public void delete(Categoria categoria);
    
}
    
    
    
   