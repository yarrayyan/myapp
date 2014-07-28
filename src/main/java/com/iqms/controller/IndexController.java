package com.iqms.controller;

import com.iqms.utils.Utils;
import java.util.LinkedHashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage(ModelMap model) {
        
        System.out.println("I am in index controller ..");         
        JSONArray arrLinks = Utils.getLinksArray("user");
        model.addAttribute("links", arrLinks);
          
        return "index";
    }
}
