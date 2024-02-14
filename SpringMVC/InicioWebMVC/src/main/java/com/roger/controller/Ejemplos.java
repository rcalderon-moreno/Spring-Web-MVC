
package com.roger.controller;
import com.roger.entidades.PersonaDTO;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ejemplos {
    
    @Autowired
    PersonaDTO personaDTO;
    
    ArrayList<PersonaDTO> listado=new ArrayList();
    
    @RequestMapping("/url")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "view.name";
    }
     
    @RequestMapping("/objeto")     
    public String objeto(Model modelo) {         
        modelo.addAttribute("objeto",personaDTO);    
        listado.add(personaDTO);
        return "objeto";
    }
        
    @RequestMapping("/listado")     
    public String listaObjetos(Model modelo) {         
        
        modelo.addAttribute("listado",listado);            
        return "objeto_listado";
    }    
}


