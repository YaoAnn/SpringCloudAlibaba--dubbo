package com.yaohuaxiang.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yaohuaxiang.sys_api.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yaohuaxiang
 * @create 2021/4/1 - 11:49
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
