package com.CUSearchEngine.SearchEngine;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
            Crawler crawler = new Crawler();
            crawler.ayhabal();


    }
}