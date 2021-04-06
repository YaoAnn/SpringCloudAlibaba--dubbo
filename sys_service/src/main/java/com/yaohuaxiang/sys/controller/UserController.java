package com.yaohuaxiang.sys.controller;

import com.yaohuaxiang.common.entity.ResultEntity;
import com.yaohuaxiang.sys_api.entity.User;
import com.yaohuaxiang.sys_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2021/4/1 - 11:51
 */

@RestController
@RequestMapping("/sys/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public ResultEntity getAll(){
        List<User> users = userService.list();
        int i  = 1/0;
        return ResultEntity.ok().setData("data",users);
    }
}
