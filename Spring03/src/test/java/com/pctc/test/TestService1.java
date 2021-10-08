package com.pctc.test;

import com.pctc.service1.Book;
import com.pctc.service1.DataTypeAll;
import com.pctc.service1.DataTypeAll1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;
import java.util.List;

public class TestService1 {


    @Test
    public void TestDataTypeAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        DataTypeAll dataTypeAll = (DataTypeAll)context.getBean("dataTypeAll");
        String array[] = dataTypeAll.getArrayValue();
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println(dataTypeAll.getListValue());
        System.out.println(dataTypeAll.getSetValue());
        System.out.println(dataTypeAll.getMapValue());
        System.out.println(dataTypeAll.getMapValue().get("k2"));
        System.out.println(dataTypeAll.getProInfo());
        System.out.println(dataTypeAll.getProInfo().get("avoirdupois"));


        DataTypeAll1 dataTypeAll1 = (DataTypeAll1)context.getBean("dataTypeAll1");
        List<Book> list = dataTypeAll1.getListValue();
        System.out.println(list);
    }
}
