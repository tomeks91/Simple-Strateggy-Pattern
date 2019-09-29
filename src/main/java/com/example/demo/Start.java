package com.example.demo;

import com.example.demo.search.BasicSearch;
import com.example.demo.search.ExtSearch;
import com.example.demo.search.SearchClient;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    @EventListener(ApplicationReadyEvent.class)
    public  void runExample(){
        new SearchClient(new BasicSearch()).search();
        new SearchClient(new ExtSearch()).search();
    }
}
