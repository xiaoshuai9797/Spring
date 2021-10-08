package com.pctc.test;

import com.pctc.service3.UserManager;
import com.pctc.service3.UserManagerImpl;
import com.pctc.service3.UserManagerImplProxy;


public class TestUserManager3 {


    public static void main(String[] args) {
      /*  UserManager userManager=new UserManagerImpl();

        userManager.addUser("lisi","123456");
        userManager.deleteUser(1);
        userManager.modifyUser(1,"wanger","654321");
        userManager.findUserById(1);

        System.out.println("上面是原对象--------------下面是代理对象");*/
       /* UserManager userManager=new UserManagerImpl();*/
     /*   UserManager userManagerProxy=new UserManagerImplProxy(userManager);*/
        UserManager userManagerProxy=new UserManagerImplProxy();
        userManagerProxy.addUser("lisi","123456");
        userManagerProxy.deleteUser(1);
        userManagerProxy.modifyUser(1,"wanger","654321");
        userManagerProxy.findUserById(1);







    }
}
