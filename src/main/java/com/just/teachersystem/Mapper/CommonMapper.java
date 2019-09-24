package com.just.teachersystem.Mapper;

import com.just.teachersystem.VO.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * 通用mapper
 */
@Mapper
public interface CommonMapper {


    //获取用户信息
    UserInfo getInfo(String worknum);


    int updateUserInfo(UserInfo userInfo);
}
