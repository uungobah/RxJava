package com.uun.gobah.firstrxjava.dao;

import com.uun.gobah.firstrxjava.entity.GobahDoc;
import org.springframework.stereotype.Component;

@Component
public class GobahDao {

    public GobahDoc [] getAllDocFromDB(){
        return produceDocs();
    }

    private GobahDoc[] produceDocs() {
        GobahDoc[] array = {
                GobahDoc.create("Java Microservice", "Refcardz"),
                GobahDoc.create("RX Java", "Article"),
                GobahDoc.create("IOT in Action", "Refcardz"),
                GobahDoc.create("Java8 in Action", "Refcardz"),
        };
        return array;
    }
}
