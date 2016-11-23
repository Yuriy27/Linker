package com.github.yuriy27.service;

/**
 * Created by Юра on 23.11.2016.
 */
public interface LinkService {

    String saveLink(String url);

    String getUrlByKey(String key);
}
