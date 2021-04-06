package com.yaohuaxiang.sys.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yaohuaxiang.sys.mapper.UserMapper;
import com.yaohuaxiang.sys_api.entity.User;
import com.yaohuaxiang.sys_api.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author yaohuaxiang
 * @create 2021/4/1 - 11:50
 */

@Service
@Component
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
