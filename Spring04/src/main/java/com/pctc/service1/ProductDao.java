package com.pctc.service1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {

	public void save(){
		//模拟操作数据库
		System.out.println("保存商品dao");
	}

}
