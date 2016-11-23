package com.github.yuriy27.service;

import com.github.yuriy27.domain.Link;
import com.github.yuriy27.repository.LinkRepository;
import com.github.yuriy27.util.CutUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    @Autowired
    private LinkRepository linkRepository;

    public String saveLink(String url) {
        String key = CutUtil.getInstance().getRandomString();
        Link link = new Link();
        link.setKey(key);
        link.setUrl(url);
        linkRepository.save(link);
        System.out.println(linkRepository.findAll());

        return key;
    }

    public String getUrlByKey(String key) {
        Link link = linkRepository.findByKey(key);
        return link.getUrl();
    }

}
