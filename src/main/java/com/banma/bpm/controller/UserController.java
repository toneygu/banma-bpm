package com.banma.bpm.controller;


import com.alibaba.fastjson.JSON;
import com.banma.bpm.domain.dto.JsonResult;
import com.banma.bpm.domain.model.User;
import com.banma.bpm.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
@Api(value = "前端接口-用户管理", description = "用于用户查询和管理")
public class UserController {
    @Autowired
    private IUserService userService;


    @PostMapping(value = "/add")
    @ApiOperation(value="新增用户信息")
    public JsonResult addUser (@RequestBody User user){
        if (userService.add(user) > 0){

            return new JsonResult();
        }

        return new JsonResult("增加失败");
    }

    @PutMapping(value = "/update")
    @ApiOperation(value="更新用户信息")
    public JsonResult updateUser (@RequestBody User user){
        if (userService.update(user) > 0){
            return new JsonResult();
        }
        return new JsonResult("增加失败");
    }

    @GetMapping(value = "/get")
    @ApiOperation(value="获取用户信息")
    public JsonResult addUser (@RequestParam String id){
        return new JsonResult(userService.getUser(id));
    }

    @DeleteMapping(value = "/delete")
    @ApiOperation(value="删除用户信息")
    public JsonResult delUser (@RequestParam String id){
        if (userService.delete(id) > 0){
            return new JsonResult();
        }
        return new JsonResult("删除失败");
    }
}
