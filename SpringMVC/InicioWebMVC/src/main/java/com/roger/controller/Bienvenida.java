
package com.roger.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bienvenida {
    
     @Value("${bienvenida.mensaje}")
    private String mensaje;
    private List<String> datos = Arrays.asList("A1", "A2","A3");
 
     @GetMapping("/bienvenida")
    public String metodoUno(Model model) {
        model.addAttribute("mensaje", this.mensaje);
        model.addAttribute("datos", this.datos);

        return "bienvenida"; //view
    }
    
    @GetMapping("/")
    public String metodoDos(Model model) {
        model.addAttribute("mensaje", this.mensaje);
        model.addAttribute("datos", this.datos);

        return "bienvenida"; //view
    }    
    
    @GetMapping("/informacion")
    public String metodoTres() {
        
        return "redirect:/informacion.html";
    }    
    
}



//    @RequestMapping("/url")
//    public String page(Model model) {
//        model.addAttribute("attribute", "value");
//        return "view.name";
//    }
    
