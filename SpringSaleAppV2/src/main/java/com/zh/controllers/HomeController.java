/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zh.controllers;

import com.zh.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {
    private CategoryService cateService;
    @RequestMapping
    public String index(Model model) {
        model.addAttribute("categories", this.cateService.getCates());
        return "index";
    }
}
