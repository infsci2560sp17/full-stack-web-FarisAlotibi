/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author faris
 */
@Controller
public class PublicController {
    
    @RequestMapping(value = {"/", "/home"})
    public ModelAndView index() {        
        return new ModelAndView("home");
    }
    
    @RequestMapping(value = "/about")
    public ModelAndView about() {        
        return new ModelAndView("about");
    }
}