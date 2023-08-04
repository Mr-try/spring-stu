package com.easyya.demo.user.controller;

import com.easyya.demo.user.entity.User;
import com.easyya.demo.user.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserMapper userMapper;

  @Operation(summary = "获取用户")
  @GetMapping("/get")
  public User getUser(@RequestParam(name = "id",required = true) String id) {
    return  userMapper.selectById(id);
  }

  @Operation(summary = "获取用户列表")
  @GetMapping("/list")
  public PageInfo<User> getUserList(
    @RequestParam(name="pageNo",defaultValue = "1") Integer pageNo,
    @RequestParam(name="pageSize",defaultValue = "10") Integer pageSize
  ) {
    PageHelper.startPage(pageNo,pageSize);
    List<User> list = userMapper.selectPage();
    return  new PageInfo<User>(list);
  }

  @Operation(summary = "添加用户")
  @PostMapping("/add")
  public String setUser(@RequestBody User user){
    userMapper.insert(user);
    return "添加成功";
  }

}
