# spring-aop
spring-aop demo
Aspect Oriented Programming

- Aspect Oriented programming 
- AOP Concepts
- Pointcut - Define point cuts to indicate where the aspect should be applied
- Aspect - Cross cutting concern, implemented as aspect
- Advice 
- Annotations
- @Before
- @After
- @Around
- Best Practises of AOP
- We can implement common feature across layers.

What is Aspect Oriented Programming?
- A layered approach is typically used to build applications: 
    - Web Layer - View logic for web apps OR JSON conversion for REST API 
    - Business Layer - Business Logic
    - Data Layer - Persistence Logic 
- Each layer has different responsibilities
    - HOWEVER, there are a few common aspects that apply to all layers 
        - Security 
        - Performance 
        - Logging 
- These common aspects are called Cross Cutting Concerns 
- Aspect Oriented Programming can be used to implement Cross Cutting Concerns 


What is Aspect Oriented Programming? - 2 
- 1: Implement the cross cutting concern as an aspect 
- 2: Define point cuts to indicate where the aspect should be applied 
- TWO Popular AOP Frameworks Spring AOP 
    - NOT a complete AOP solution BUT very popular 
    - Only works with Spring Beans
    - Example: Intercept method calls to Spring Beans 
- AspectJ 
    - Complete AOP solution BUT rarely used
    - Example: Intercept any method call on any Java class 
    - Example: Intercept change of values in a field 

Two Popular AOP Frameworks

- Spring AOP
    - Not a complete AOP Solution BUT Very popular
    - Only works with Spring Beans
    - Example:Intercept method calls to Spring Beans
- AspectJ
    - Complete AOP solution BUT rarely used 
    - Example : Intercept any method call on any Java class
    - Example: Intercept change of values in a field

Aspect Oriented Programming - Important Terminology 
- Compile Time 
    - Advice - What code to execute? 
        - Example: Logging, Authentication 
    - Pointcut - Expression that identifies method calls to be intercepted 
        - Example: execution( com.in28minutes.aop.data..*(..)) 
    - Aspect - A combination of 
        - 1: Advice - what to do AND 
        - 2: Pointcut - when to intercept a method call
    - Weaver - Weaver is the framework that implements AOP 
        - AspectJ or Spring AOP 
- Runtime
    - Join Point - When pointcut condition is true, the advice is executed. A specific execution instance of an advice is called a Join Point. 

Aspect Oriented Programming - Important Annotations 
- @Before - Do something before a method is called 
- @After - Do something after a method is executed irrespective of whether: 
    - 1: Method executes successfully OR 
    - 2: Method throws an exception 
- @AerReturning - Do something ONLY when a method executes successfully 
- @AerThrowing - Do something ONLY when a method throws an exception 
- @Around - Do something before and after a method execution Do something AROUND a method execution 
