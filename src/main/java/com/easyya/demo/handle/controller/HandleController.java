package com.easyya.demo.handle.controller;

import cn.hutool.json.JSONException;
import com.easyya.demo.handle.constant.Status;
import com.easyya.demo.handle.exception.JsonException;
import io.swagger.v3.oas.models.responses.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/handle")
public class HandleController {

  @GetMapping("/json")
  @ResponseBody
  public ApiResponse jsonException(){
    throw new JsonException(Status.OK);
  }
}
