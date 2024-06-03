/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cadastromanga.erp.controller;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class MangaBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Manga manga;

    public Manga getManga() {
        return manga;
    }
    
    
            
    
    
    
}
