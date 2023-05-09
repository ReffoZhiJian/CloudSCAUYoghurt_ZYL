package com.zylstudy.SCAUYoghurt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zylstudy.SCAUYoghurt.entity.OrderDetail;
import com.zylstudy.SCAUYoghurt.mapper.OrderDetailMapper;
import com.zylstudy.SCAUYoghurt.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
