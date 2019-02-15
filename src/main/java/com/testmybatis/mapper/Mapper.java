package com.testmybatis.mapper;

import com.testmybatis.pojo.User;

/**
 * Created by admin on 2019/2/15.
 */
public interface Mapper {
    User selectUser(Integer id);
}
