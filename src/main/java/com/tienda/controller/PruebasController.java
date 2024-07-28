/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.domain.Categoria;

import com.tienda.services.CategoriaService;
import com.tienda.services.ProductoService;
import com.tienda.domain.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pruebas")
public class PruebasController {
    
    @Autowired
    private ProductoService productoService; 
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model) {
        var productos = productoService.getProductos(false);
        model.addAttribute("productos", productos);
      
        var categorias = categoriaService.getCtegorias(false);
        model.addAttribute("categorias", categorias);
        
        return "/pruebas/listado";
    }
    
    @GetMapping("/listado/{idCategoria}")
    public String listado(Categoria categoria, Model model) {
        var productos = categoriaService.getCategoria(categoria).getProductos();
        model.addAttribute("productos", productos);
        var categorias = categoriaService.getCtegorias(false);
        model.addAttribute("categorias", categorias);

        return "/pruebas/listado";
    }

    @GetMapping("/listado2")
    public String listado2(Model model) {
        var productos = productoService.getProductos(false);
        model.addAttribute("productos", productos);
        return "/pruebas/listado2";
    }

    @PostMapping("/consulta1")
    public String consulta1(
        @RequestParam(value="precioInf") double precioInf,
        @RequestParam(value="precioSup") double precioSup,  
            Model model) {
        
        var productos = productoService.consulta1(precioInf,precioSup);
        model.addAttribute("productos", productos);
        
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        
        return "/pruebas/listado2";
    }
    
    @PostMapping("/consulta2")
    public String consulta2(
            @RequestParam(value="precioInf") double precioInf,
            @RequestParam(value="precioSup") double precioSup,
            Model model) {
 
        var productos = productoService.consulta2(precioInf, precioSup);
        model.addAttribute("productos", productos);
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
 
        return "/pruebas/listado2"; 
    }
    @PostMapping("/consulta3")
    public String consulta3(
            @RequestParam(value="precioInf") double precioInf,
            @RequestParam(value="precioSup") double precioSup,
            Model model) {
 
        var productos = productoService.consulta3(precioInf, precioSup);
        model.addAttribute("productos", productos);
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
 
        return "/pruebas/listado2"; 
    }

    @PostMapping("/consulta4")
    public String consulta4(
            @RequestParam(value="descripcion") String descripcion,
            Model model) {
 
        var productos = productoService.consulta4(descripcion);
        model.addAttribute("productos", productos);
        model.addAttribute("descripcion", descripcion);
        
        return "/pruebas/listado2"; 
    }
}
