/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author user
 */
public interface ProductoDao
        extends JpaRepository<Producto, Long> {
    //Una consulta ampliada por precio
    public List <Producto> findByPrecioBetweenOrderByDescripcion 
        (double precioInf, 
         double precioSup);
        
        
//Una consulta amediante JPQL
     @Query(value="SELECT a FROM Producto a "
             + "Where a.precio Between :precioInf AND :precioSup "
             + "ORDER BY a.descripcion ASC")   
    public List <Producto> consultaJPQL (double precioInf, double precioSup);  

    //Una consulta amediante SQL
     @Query(nativeQuery=true, 
             value="SELECT * FROM producto a "
             + "Where a.precio Between :precioInf AND :precioSup "
             + "ORDER BY a.descripcion ASC")   
    public List <Producto> consultaSQL (double precioInf, double precioSup); 
    
    
    //CONSULTA JPQL DE DESCRIPCION
     @Query(value= "SELECT a FROM Producto a "
             + "WHERE a.descripcion LIKE %:descripcion% "
             + "ORDER BY a.descripcion ASC")  
    public List<Producto> consultaJPQL2(@Param("descripcion") String descripcion); 

   //CONSULTA SQL DE DESCRIPCION
    @Query(nativeQuery = true, 
       value = "SELECT * FROM producto a "
             + "WHERE a.descripcion LIKE %:descripcion% "
             + "ORDER BY a.descripcion ASC")
public List<Producto> consultaSQL2(@Param("descripcion") String descripcion);
}

