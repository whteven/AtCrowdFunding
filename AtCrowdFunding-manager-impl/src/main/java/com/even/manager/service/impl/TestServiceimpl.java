package com.even.manager.service.impl;

import com.even.manager.dao.TestDao;
import com.even.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TestServiceimpl implements TestService {

    @Autowired
    private TestDao testDao;
    @Override
    public void insert() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name","two");
        testDao.insert(objectObjectHashMap);

    }
}
