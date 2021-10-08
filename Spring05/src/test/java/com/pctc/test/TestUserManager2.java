package com.pctc.test;

import com.pctc.service2.UserManager;
import com.pctc.service2.UserManagerImpl;

public class TestUserManager2 {


    public static void main(String[] args) {
        UserManager userManager=new UserManagerImpl();
        userManager.addUser("lisi","123456");
        userManager.deleteUser(1);
        userManager.modifyUser(1,"wanger","654321");
        userManager.findUserById(1);
    }
}
