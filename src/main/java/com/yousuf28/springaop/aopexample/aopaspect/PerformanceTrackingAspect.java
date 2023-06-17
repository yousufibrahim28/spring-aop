package com.yousuf28.springaop.aopexample.aopaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //@Around("com.yousuf28.springaop.aopexample.aopaspect.CommonPointCutConfig.businessAndDataPackageConfig()") // Executes before and after a method call.
    @Around("com.yousuf28.springaop.aopexample.aopaspect.CommonPointCutConfig.trackTimeAnnotation()")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long startTimeInMillis = System.currentTimeMillis();

        Object returnValue = proceedingJoinPoint.proceed();

        long stopTimeInMillis = System.currentTimeMillis();

        long executionDuration = stopTimeInMillis - startTimeInMillis;

        logger.info("Around Aspect - {} Method executed in {} ms",proceedingJoinPoint,executionDuration);

        return returnValue;

    }
}
