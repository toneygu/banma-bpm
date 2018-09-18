package com.banma.bpm.domain.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "标准返回实体")
public class JsonResult<T> {
    @ApiModelProperty(value = "接口状态码,非0异常")
    private Integer code;
    @ApiModelProperty(value = "code非0则显示错误信息")
    private String message;
    @ApiModelProperty(value = "返回查找到的信息")
    private T data;

    public JsonResult() {
        this.code = 0;
        this.message = "操作成功";
    }

    public JsonResult(String message) {
        this.code = 1;
        this.message = message;
    }

    public JsonResult(T data) {
        this.code = 0;
        this.message = "操作成功";
        this.data = data;
    }

    public JsonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

