package com.uun.gobah.firstrxjava.service;

import io.reactivex.Observable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Month;

@Service
public class AdminService {

    public Observable<BigInteger> costForMonth (int year, Month month){
        LocalDate now = LocalDate.now();

        if (year == now.getYear() && month == now.getMonth()){
            return Observable.just(BigInteger.ZERO);
        }

        if (year > now.getYear() || year == now.getYear() && month.getValue() > now.getMonthValue()){
            return Observable.just(BigInteger.ZERO);
        }

        return Observable.just(month.getValue())
                .map(v -> year + v * 100)
                .map(integer -> BigInteger.valueOf(integer));
    }
}
