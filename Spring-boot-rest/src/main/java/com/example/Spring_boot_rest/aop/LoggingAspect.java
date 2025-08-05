package com.example.Spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    public static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);

//    return type  full class-name.method-name(args)
    @Before("execution (* com.example.Spring_boot_rest.service.JobService.getAllJobs(..)) || execution (* com.example.Spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }

    @After("execution (* com.example.Spring_boot_rest.service.JobService.getAllJobs(..)) || execution (* com.example.Spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodFinal(JoinPoint jp) {
        LOGGER.info("Method Finally " + jp.getSignature().getName());
    }

    @AfterReturning("execution (* com.example.Spring_boot_rest.service.JobService.getAllJobs(..)) || execution (* com.example.Spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodSuccess(JoinPoint jp) {
        LOGGER.info("Method success " + jp.getSignature().getName());
    }
// after error comes
    @AfterThrowing("execution (* com.example.Spring_boot_rest.service.JobService.getAllJobs(..)) || execution (* com.example.Spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodFail(JoinPoint jp) {
        LOGGER.info("Method Exception " + jp.getSignature().getName());
    }

}
