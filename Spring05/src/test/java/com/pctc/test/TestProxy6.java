package com.pctc.test;

import com.pctc.service6.*;
import org.junit.Test;

public class TestProxy6 {


    @Test
    public void test1(){
        CglibProxy proxy = new CglibProxy();
       //HostManageImpl没有实现接口,jdk不能代理，cglib可以代理
        HostManageImpl hostManage=(HostManageImpl)proxy.getProxy(HostManageImpl.class);
        hostManage.save("haier");
    }


    @Test
    public void test2(){
        CglibProxy proxy = new CglibProxy();
        UserManager userManager=(UserManager)proxy.getProxy(UserManagerImpl.class);
        userManager.addUser("lisi","123456");
    }




    @Test
    public void test3(){
        CglibProxy1 proxy = new CglibProxy1();
        //HostManageImpl没有实现接口,jdk不能代理，cglib可以代理
        HostManageImpl hostManage=(HostManageImpl)proxy.getProxy(HostManageImpl.class);
        hostManage.save("haier");
    }


    @Test
    public void test4(){
        CglibProxy1 proxy = new CglibProxy1();
        UserManager userManager=(UserManager)proxy.getProxy(UserManagerImpl.class);
        userManager.addUser("lisi","123456");
    }



}
