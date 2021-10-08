package com.pctc.service4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;




//jdk动态代理，只要实现了InvocationHandler接口，可以代理所有接口,Proxy.newProxyInstance生成一个代理对象
//jdk动态代理可以代理所有接口对象,接口中所有方法
public class UserHandler implements InvocationHandler {


    private Object targetObject;//目标对象

    //返回值是一个代理对象
    public Object newProxy(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this);

    }



    //当原对象中方法被调用时，就执行invoke这个方法
    /**
     * proxy 代理对象
     * method 当前的方法
     * args 当前的方法中参数
     * Object 方法执行后的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //方法执行之前做什么
        checkbefore();


        Object ret = null; //方法执行之后的返回值
        try {

            //通过反射调用。
            ret = method.invoke(this.targetObject, args);

            //方法执行之后干什么


        }catch(Exception e) {
            e.printStackTrace();

            //出错之后干什么
        }


        //最终做什么
        checkafter();

        System.out.println(ret);
        System.out.println(method.getName());
        for(Object a :args)
            System.out.println(a.toString());


        return ret;
    }









    private void checkbefore() {
        System.out.println("before-------------------------");
    }



    private void checkafter() {
        System.out.println("after-------------------------");
    }


}
