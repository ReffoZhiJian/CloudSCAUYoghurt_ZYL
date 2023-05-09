package com.zylstudy.SCAUYoghurt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zylstudy.SCAUYoghurt.entity.Employee;
import com.zylstudy.SCAUYoghurt.mapper.EmployeeMapper;
import com.zylstudy.SCAUYoghurt.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
