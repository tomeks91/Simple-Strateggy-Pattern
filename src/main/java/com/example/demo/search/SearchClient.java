package com.example.demo.search;

public class SearchClient {
    private final Search search;

    public SearchClient(Search search) {
        this.search = search;
    }

    public void search(){
        search.searchInBase();
    }
}
