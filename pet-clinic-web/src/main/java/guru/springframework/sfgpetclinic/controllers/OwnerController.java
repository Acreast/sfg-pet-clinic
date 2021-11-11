package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    //The request mapping annotation above has shortened the mapping
    @RequestMapping({"/","","/index","/index.html"})
    public String ListOwners(){
        return "owners/index";
    }
}
