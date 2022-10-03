package ch.bbw.sru.cluedo.controller;

import ch.bbw.sru.cluedo.model.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CluedoController {

    @Autowired
    DataService service;

    @GetMapping("/cluedo")
    public String showCluedo(Model model) {
        System.out.println("CluedoController.showCluedo()");
        model.addAttribute("personList", service.getPersons());
        return "cluedoView";
    }
}
