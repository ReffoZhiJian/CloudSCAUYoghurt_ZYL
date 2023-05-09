package com.zylstudy.SCAUYoghurt.dto;

import com.zylstudy.SCAUYoghurt.entity.Setmeal;
import com.zylstudy.SCAUYoghurt.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
