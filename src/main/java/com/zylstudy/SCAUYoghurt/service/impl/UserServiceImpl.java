package com.zylstudy.SCAUYoghurt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zylstudy.SCAUYoghurt.entity.User;
import com.zylstudy.SCAUYoghurt.mapper.UserMapper;
import com.zylstudy.SCAUYoghurt.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
