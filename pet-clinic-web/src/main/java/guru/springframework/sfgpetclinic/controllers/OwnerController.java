package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    //Injected property
    //@Autowired is not added as after spring 4.2 it knows what do inject
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    //The request mapping annotation above has shortened the mapping
    //By declaring model, spring mvc will add a model when it calls this method
    @RequestMapping({"/","","/index","/index.html"})
    public String ListOwners(Model model){
        //owner attribute will be added and can be referred to in the owner index template
        model.addAttribute("owners",ownerService.findAll());

        return "owners/index";
    }
}
