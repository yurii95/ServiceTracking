package com.globallogic.yurii.kozachok.view.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ownerCompanies")
public class OwnerController {
    
    private static final String COMPANY_HOME_PAGE = "mainPageForCompany";
    
    @RequestMapping(value = "/companyManagement", method = RequestMethod.GET)
    public String showOwnerPage(ModelMap model) {
        return COMPANY_HOME_PAGE;
    }

}
