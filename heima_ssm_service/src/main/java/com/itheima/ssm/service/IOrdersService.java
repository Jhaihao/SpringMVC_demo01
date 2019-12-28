package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll() throws Exception;

    Orders findById(String ordersId) throws Exception;
}
