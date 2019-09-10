/*******************************************************************************
 * Copyright (C) 2018 - 2019, The YUAN Authors.
 * All Rights Reserved.
 ******************************************************************************/

package cn.lhzh.plenzyme.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lhzh.plenzyme.bean.Test;
import cn.lhzh.plenzyme.dao.TestDao;
import cn.lhzh.plenzyme.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;

    @Override
    public void addMsg(Test t) {
        System.out.println("1111111111111111111111111");
        testDao.add(t);

    }
}
