package com.yousuf28.springaop.aopexample.aopaspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

    // Best Practise if the package changes we need to make change only in this place.
    @Pointcut("execution(* com.yousuf28.springaop.aopexample.*.*.*(..))")
    public void businessAndDataPackageConfig() {

    }

    // Best Practise if the package changes we need to make change only in this place.
    @Pointcut("execution(* com.yousuf28.springaop.aopexample.business.*.*(..))")
    public void businessPackageConfig() {

    }

    // Best Practise if the package changes we need to make change only in this place.
    @Pointcut("execution(* com.yousuf28.springaop.aopexample.data.*.*(..))")
    public void dataPackageConfig() {

    }
    // This way of definition will intercept any bean that is a service i.e it has Service in its class name
    @Pointcut("bean(*Service*)")
    public void dataPackageConfigUsingBean() {

    }

    @Pointcut("@annotation(com.yousuf28.springaop.aopexample.annotations.TrackTime)")
    public void trackTimeAnnotation() {}

}
