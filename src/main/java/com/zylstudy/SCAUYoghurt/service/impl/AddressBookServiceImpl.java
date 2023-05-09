package com.zylstudy.SCAUYoghurt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zylstudy.SCAUYoghurt.entity.AddressBook;
import com.zylstudy.SCAUYoghurt.mapper.AddressBookMapper;
import com.zylstudy.SCAUYoghurt.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
