package com.easyya.demo.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easyya.demo.user.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
  /**
   * 分页查询用户
   * @return
   */
  List<User> selectPage();
}
