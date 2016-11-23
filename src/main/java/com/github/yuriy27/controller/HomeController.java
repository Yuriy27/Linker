package com.github.yuriy27.controller;

import com.github.yuriy27.service.LinkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    @Autowired
    private LinkServiceImpl service;

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @RequestMapping(value = "/--/{key}", method = RequestMethod.GET)
    public RedirectView redirect(@PathVariable("key") String key) {
        RedirectView view = new RedirectView();
        String url = service.getUrlByKey(key);
        view.setUrl(url);
        return view;
    }

}
