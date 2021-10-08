package com.pctc.test;

import com.pctc.service5.*;

public class TestUserHandler4 {


    public static void main(String[] args) {
        UserManager userManager=new UserManagerImpl();

        UserHandler userHandler=new UserHandler();

        UserManager userManager1 = (UserManager)userHandler.newProxy(userManager);

        userManager1.addUser("lisi","123456");
        userManager1.deleteUser(1);
        userManager1.modifyUser(1,"wanger","654321");
        userManager1.findUserById(1);


        System.out.println("-----代理其他接口-------");

        HostManageImpl hostManager=new HostManageImpl();
        HostManageImpl hostManager1 = (HostManageImpl)userHandler.newProxy(hostManager);
        hostManager1.save("wanger");

    }
}
