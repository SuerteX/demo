package com.example.demo.service.impl;

import com.example.demo.dataobject.DemoData;
import com.example.demo.service.DemoInter;
import org.springframework.stereotype.Service;

@Service
public class DemoInterImpl implements DemoInter {

    @Override
    public Integer getAgeFromName(String name) {
        DemoData demoData=new DemoData();

        return demoData.getAge();
    }
}
