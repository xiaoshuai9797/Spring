package com.pctc.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="aaa")
//@Component("aaa")
//@Component
/* 如果使用上面的注解，那么test中getbean里面写@Component里面的名字
    没写则默认是类名名*/
public class ProductServlet {

	@Autowired
	private ProductService productService;

	public void execute(){
		System.out.println("接受请求servlet");
		productService.add();
	}

}
