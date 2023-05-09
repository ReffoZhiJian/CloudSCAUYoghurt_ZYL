package com.zylstudy.SCAUYoghurt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zylstudy.SCAUYoghurt.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
