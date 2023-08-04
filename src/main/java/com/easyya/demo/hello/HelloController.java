package com.easyya.demo.hello;

import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/hello")
  String sayHello(@RequestParam(name="who",required = false) String who){
    if(StrUtil.isBlank(who)){
      who = "World";
    }
    return  StrUtil.format("hello, {}!",who);
  }
}
