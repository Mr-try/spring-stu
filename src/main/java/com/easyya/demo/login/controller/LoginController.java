package com.easyya.demo.login.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="登录管理")
@RestController
@RequestMapping("/sys")
public class LoginController {
  private final RedisTemplate redisTemplate;
  public LoginController(RedisTemplate redisTemplate) {
    this.redisTemplate = redisTemplate;
  }

  @GetMapping("save")
  public String save(@RequestParam(name = "key") String key,
                     @RequestParam(name = "value") String value){
    System.out.println(key);
    System.out.println(value);
    redisTemplate.opsForValue().set(key, value);
    return  "设置成功";
  }


  @GetMapping("/login")
  String login(
    @RequestParam(name = "name") String name,
    @RequestParam(name = "password") String password
  ){
    return  "登录成功";
  }
}
