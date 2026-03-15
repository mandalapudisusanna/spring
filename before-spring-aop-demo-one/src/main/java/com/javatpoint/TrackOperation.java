package com.javatpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class TrackOperation {
    @Pointcut("execution(* Operation.*(..))")
    public void k() {}			 // pointcut name
    @Before("k()")
    public void myadvice(JoinPoint jp) {
        System.out.println("additional concern");
        // Optional: Uncomment to print method signature
        // System.out.println("Method Signature: " + jp.getSignature());
    }
}
