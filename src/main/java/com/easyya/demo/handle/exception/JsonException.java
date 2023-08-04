package com.easyya.demo.handle.exception;

import com.easyya.demo.handle.constant.Status;
import lombok.Getter;

@Getter
public class JsonException extends BaseException {
  public JsonException(Status status){
    super(status);
  }
}
