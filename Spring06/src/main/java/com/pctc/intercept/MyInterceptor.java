package com.pctc.intercept;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;


public class MyInterceptor {

    public void doAccessCheck(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object []args = joinPoint.getArgs();
        System.out.println("方法名"+methodName+"参数值"+ Arrays.asList(args));
        System.out.println("前置通知");

    }

    public void doAfterReturning(JoinPoint joinPoint,Object result){
            String methodName = joinPoint.getSignature().getName();
            Object[] args=joinPoint.getArgs();
            System.out.println("方法名"+methodName+"参数值"+ Arrays.asList(args));
            System.out.println("后置通知");
    }


//类似finnaly方法
    public void doAfter(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名"+methodName+"参数值"+ Arrays.asList(args));
        System.out.println("最终通知");
    }


    //出错，catch方法
    public void doAfterThrowing(JoinPoint joinPoint,Exception e) {
        String methodName = joinPoint.getSignature().getName();
        Object [] args = joinPoint.getArgs();
        System.out.println("方法名: " + methodName + " 参数值： " + Arrays.asList(args) + "   例外:" + e);
        System.out.println("例外通知");

    }



    //方法执行之前后，整个生命周期都包括
    public Object doBasic(ProceedingJoinPoint pjp) throws Throwable {

        Object result = null;
        String methodName = pjp.getSignature().getName();

        try {
            //前置通知
            System.out.println("前置通知");
            System.out.println("方法名： " + methodName + "参数值：" + Arrays.asList(pjp.getArgs()));

            //执行目标方法
            result = pjp.proceed();

            System.out.println("后置通知");
            //返回通知
            System.out.println("方法名： " + methodName+ "  参数值：" + Arrays.asList(pjp.getArgs())+ " 返回结果： " + result);

        } catch (Throwable e) {

            //异常通知
            System.out.println("异常通知");
            System.out.println("方法名： " + methodName+ "  参数值：" + Arrays.asList(pjp.getArgs())+ "异常通知:" + e);

        }

        //最终通知
        System.out.println("最终通知");
        System.out.println("方法名： " + methodName+ "参数值：" + Arrays.asList(pjp.getArgs())+ " 最终结束");

        //公共业务处理代码
        System.out.println("权限控制系统！！！！");
        return result;
    }





}
