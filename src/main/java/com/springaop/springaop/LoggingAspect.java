package com.springaop.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.springaop.springaop.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Before " + joinPoint.getSignature().getName() + " method is called");
    }

    @AfterReturning(pointcut = "execution(* com.springaop.springaop.*.*(..))",
            returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        logger.info("After " + joinPoint.getSignature().getName() + " method is called. Return value is " + result);
    }

}
