package com.uun.gobah.firstrxjava.service;


import com.uun.gobah.firstrxjava.dao.GobahDao;
import com.uun.gobah.firstrxjava.entity.GobahDoc;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    GobahDao gobahDao;

    public Observable<GobahDoc> getAllDocs(){
        return Observable.fromArray(gobahDao.getAllDocFromDB());
    }

    public void printAllDocs() {

        getAllDocs().subscribe(System.out::println);

        System.out.println("Using Map");
        getAllDocs().map(doc -> doc.getName()).subscribe(System.out::println);
    }

    public void printFilter() {
        System.out.println("Filter");
        getAllDocs().filter(docs -> "Refcardz".equalsIgnoreCase(docs.getType()))
                .filter(doc -> doc.getName().contains("Java"))
                .subscribe(System.out::println);
    }
}
