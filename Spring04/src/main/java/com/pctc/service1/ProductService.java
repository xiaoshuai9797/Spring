package com.pctc.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ProductService {

	@Autowired//想当于ByType//给引用类型使用
	@Qualifier("productDao")//相当于ByName
	private ProductDao productDao;

	public void add(){
		System.out.println("添加商品service");
		productDao.save();
	}

}
