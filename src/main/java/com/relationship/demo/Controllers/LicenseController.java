package com.relationship.demo.Controllers;

import com.relationship.demo.Services.LicenseService;
import com.relationship.demo.Services.PersonService;
import com.relationship.demo.models.License;
import com.relationship.demo.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LicenseController {
    private final LicenseService licenseService;
    private  final PersonService personService;

    public LicenseController(LicenseService licenseService, PersonService personService) {
        this.licenseService = licenseService;
        this.personService = personService;
    }

    @RequestMapping("license/new")
    public String showForm(@ModelAttribute("license")License license, Model model){

        List<Person> personNoLicense=  personService.findPersonWithOutLicense();

        model.addAttribute("persons",personNoLicense);

        return "license/new.jsp";
    }
}
