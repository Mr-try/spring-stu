package com.easyya.demo.handle.constant;

import lombok.Getter;

@Getter
public enum Status {

  OK(200,"操作成功"),
  UNKNOW_ERROR(500,"服务器出错了");

  private Integer code;
  private String message;
  Status(Integer code,String message){
    this.code = code;
    this.message = message;
  }

}
