package com.just.teachersystem.Mapper;

import com.just.teachersystem.VO.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 通用mapper
 */
@Mapper
public interface CommonMapper {

    UserInfo getInfo(String worknum);
}
