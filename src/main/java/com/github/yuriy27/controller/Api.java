package com.github.yuriy27.controller;

import com.github.yuriy27.service.LinkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {

    @Autowired
    private LinkServiceImpl linkService;

    @RequestMapping(method = RequestMethod.GET)
    public String getCuttedUrl(@RequestParam("url") String url) {
        return linkService.saveLink(url);
    }

}
