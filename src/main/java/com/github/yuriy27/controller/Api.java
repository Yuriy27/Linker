package com.github.yuriy27.controller;

import com.github.yuriy27.repository.LinkRepository;
import com.github.yuriy27.service.LinkService;
import com.github.yuriy27.util.CutUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {

    @Autowired
    private LinkService linkService;

    @RequestMapping(method = RequestMethod.GET)
    public String getCuttedUrl(@RequestParam("url") String url) {
        return linkService.saveLink(url);
    }

}
