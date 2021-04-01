package com.zqq.springboot.service.impl;

import com.zqq.springboot.entity.User;
import com.zqq.springboot.mapper.UserMapper;
import com.zqq.springboot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zqq
 * @since 2021-04-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
