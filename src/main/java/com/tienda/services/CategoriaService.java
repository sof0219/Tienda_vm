/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author user
 */
public interface CategoriaService {
    //Se obtienen los registros de la tambla categoria en una Array list
    //de objetos Categoria, todos o solo los activos
    
   public List<Categoria> getCategorias(boolean activos);
}
