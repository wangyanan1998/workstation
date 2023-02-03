package com.itheima.reggie.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;

/**
 * @author 咕咕猫
 * @version 1.0
 */
public interface OrderService extends IService<Orders> {

    //用户下单
    public void submit(Orders orders);

}
