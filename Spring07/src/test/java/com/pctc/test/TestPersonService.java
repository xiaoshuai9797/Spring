package com.pctc.test;

import com.pctc.service.PersonService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonService {


    private static PersonService personService;
    private static ApplicationContext cxt;


    @After
    public void testAfter(){
        System.out.println("在@Test之后执行");
    }

    @AfterClass
    public static void testAfterClass(){
        System.out.println("在public static void方法之后执行");
    }

    //BeforeClass运行测试时只会执行一次，而且方法必须sataic修饰
    // 而Before每点一次测试就运行一次Before
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
        personService = (PersonService)cxt.getBean("personService");
    }


    @Test
    public void testSave(){
        personService.save("xs");
    }

    @Test
    public void testUpdate(){
        personService.update("xs",22);
    }

    @Test
    public void testGetPersonName(){
        personService.getPersonName(2);
    }



}
