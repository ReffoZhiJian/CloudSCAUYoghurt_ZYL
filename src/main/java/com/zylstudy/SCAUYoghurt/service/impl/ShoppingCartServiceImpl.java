package com.zylstudy.SCAUYoghurt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zylstudy.SCAUYoghurt.entity.ShoppingCart;
import com.zylstudy.SCAUYoghurt.mapper.ShoppingCartMapper;
import com.zylstudy.SCAUYoghurt.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
