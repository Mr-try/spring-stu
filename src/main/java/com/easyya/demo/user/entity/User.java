package com.easyya.demo.user.entity;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "use entity")
public class User {
  @Schema(description = "主键id")
  private String id;

  @Schema(description = "名称")
  private String name;
}
