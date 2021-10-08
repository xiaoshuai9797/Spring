package com.pctc.service4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//jdk动态代理，只要实现了InvocationHandler接口，可以代理所有接口
public class UserHandler1{

	private Object targetObject;//目标对象一定是实现了接口

	//返回值是一个代理对象
	public Object newProxy(Object targetObject) {
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
									  targetObject.getClass().getInterfaces(),
									  new InvocationHandler() {

			//当原对象中方法被调用时，就执行invoke这个方法
			/**
			 * proxy 代理对象
			 * method 方法
			 * args 参数
			 * object 方法执行后的返回值
			 */
										@Override
										public Object invoke(Object proxy, Method method, Object[] args)
												throws Throwable {

											//方法执行之前做什么
											checkbefore();


											Object ret = null; //方法执行之后的返回值
											try {

												//内部类调用外部类中的属性。类名.this.属性名
												ret = method.invoke(UserHandler1.this.targetObject, args);

												//方法执行之后干什么

											}catch(Exception e) {
												e.printStackTrace();
												//throw new java.lang.RuntimeException(e);
												//出错之后干什么
											}

											System.out.println(ret);
											System.out.println(method.getName());
											for(Object a :args)
												System.out.println(a.toString());

											//最终做什么
											checkafter();

											return ret;

										}
									});

	}










	private void checkbefore() {
		System.out.println("before1111-------------------------");
	}



	private void checkafter() {
		System.out.println("after1111-------------------------");
	}


}
