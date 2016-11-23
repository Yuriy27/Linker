package com.github.yuriy27.controller;

import com.github.yuriy27.repository.LinkRepository;
import com.github.yuriy27.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.constraints.NotNull;

@Controller
public class HomeController {

    @Autowired
    private LinkService service;

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
