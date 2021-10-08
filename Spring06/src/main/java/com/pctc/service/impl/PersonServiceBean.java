package com.pctc.service.impl;

import com.pctc.service.PersonService;

public class PersonServiceBean implements PersonService {

    @Override
    public void save(String name) {
        System.out.println("save");
    }

    @Override
    public void update(String name, Integer id) {
        System.out.println("update");
    }

    @Override
    public String getPersonName(Integer id) {
        System.out.println("id");
        return "xs";
    }
}
