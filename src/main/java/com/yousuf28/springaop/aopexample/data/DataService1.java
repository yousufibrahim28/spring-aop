package com.yousuf28.springaop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {

    public int[] retrieveData() {
        return new int[] {11,22,33,44,55};
    }
}
