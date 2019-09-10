/*******************************************************************************
 * Copyright (C) 2018 - 2019, The YUAN Authors.
 * All Rights Reserved.
 ******************************************************************************/

package cn.lhzh.plenzyme.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.lhzh.plenzyme.bean.Test;

@Mapper
public interface TestDao {

    void add(Test t);

}
