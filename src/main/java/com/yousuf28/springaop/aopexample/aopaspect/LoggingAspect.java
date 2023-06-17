package com.yousuf28.springaop.aopexample.aopaspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Configuration
//AOP
@Configuration
@Aspect // Combination of Advice and Pointcut is called Aspect
// Weaver - is the framework that implements AOP, AspectJ or Spring AOP
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    // Pointcut - When?
    // execution(* PACKAGE.*.*(..)) - syntax for defining pointcut
    // Best Practise, if the package changes we need to make change only in the below method, this called named pointcut
    @Before("com.yousuf28.springaop.aopexample.aopaspect.CommonPointCutConfig.businessAndDataPackageConfig()") // PointCut - specifically called execution pointcut - Intercepts all methods Before execution
    public void logMethodCallBeforeExecution(JoinPoint joinPoint) { // Runtime - Joint Point - Specific instance of Advice is called Joint point
        //Logic - what to dod?
        logger.info("Before Aspect - {} is called with arguments - {}",joinPoint, joinPoint.getArgs()); // Advice example : Logging or Authentication
    }

    // Best Practise, if the package changes we need to make change only in the below method, this called named pointcut
    @After("com.yousuf28.springaop.aopexample.aopaspect.CommonPointCutConfig.businessAndDataPackageConfig()") // PointCut - specifically called execution pointcut - Intercepts all methods After execution
    public void logMethodCallAfterExecution(JoinPoint joinPoint) { // Runtime - Joint Point - Specific instance of Advice is called Joint point
        //Logic - what to dod?
        logger.info("After Aspect - {} has executed",joinPoint); // Advice example : Logging or Authentication
    }

    // Best Practise, if the package changes we need to make change only in the below method, this called named pointcut
    @AfterThrowing(pointcut = "com.yousuf28.springaop.aopexample.aopaspect.CommonPointCutConfig.businessAndDataPackageConfig()",
                   throwing = "exception") // PointCut - specifically called execution pointcut - Intercepts methods After throwing an error
    public void logMethodCallAfterThrowingExecution(JoinPoint joinPoint, Exception exception) { // Runtime - Joint Point - Specific instance of Advice is called Joint point
        //Logic - what to dod?
        logger.info("AfterThrowing Aspect - {} has thrown an Exception - {}",joinPoint, exception); // Advice example : Logging or Authentication
    }

    // Best Practise, if the package changes we need to make change only in the below method, this called named pointcut
    @AfterReturning(pointcut = "com.yousuf28.springaop.aopexample.aopaspect.CommonPointCutConfig.businessAndDataPackageConfig()",
                    returning = "resultValue") // PointCut - specifically called execution pointcut - Intercepts methods After Returning successfully
    public void logMethodCallAfterReturningSuccessfulExecution(JoinPoint joinPoint, Object resultValue) { // Runtime - Joint Point - Specific instance of Advice is called Joint point
        //Logic - what to dod?
        logger.info("AfterReturning Aspect - {} has successfully executed and returned {}",joinPoint, resultValue); // Advice example : Logging or Authentication
    }
}
