package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    /**
     * 修改套餐回显
     * @param id
     * @return
     */
    public SetmealDto getByIdWith(Long id);

    /**
     * 修改套餐
     * @param setmealDto
     */
    public void updateWithDish(SetmealDto setmealDto);
}