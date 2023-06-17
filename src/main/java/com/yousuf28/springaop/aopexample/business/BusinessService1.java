package com.yousuf28.springaop.aopexample.business;

import com.yousuf28.springaop.aopexample.annotations.TrackTime;
import com.yousuf28.springaop.aopexample.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class BusinessService1 {

    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    @TrackTime
    public int calculateMax() {
        int[] data = dataService1.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }
}
