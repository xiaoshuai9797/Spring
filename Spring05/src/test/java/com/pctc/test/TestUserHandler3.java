package com.pctc.test;

import com.pctc.service4.*;

public class TestUserHandler3 {


    public static void main(String[] args) {
        UserManager userManager=new UserManagerImpl();

        UserHandler3 userHandler=new UserHandler3();

        UserManager userManager1 = (UserManager)userHandler.newProxy(userManager);

        userManager1.addUser("lisi","123456");
        userManager1.deleteUser(1);
        userManager1.modifyUser(1,"wanger","654321");
        userManager1.findUserById(1);


        System.out.println("-----代理其他接口-------");

        HostManager hostManager=new HostManageImpl();
        HostManager hostManager1 = (HostManager)userHandler.newProxy(hostManager);
        hostManager1.save("wanger");

    }
}
