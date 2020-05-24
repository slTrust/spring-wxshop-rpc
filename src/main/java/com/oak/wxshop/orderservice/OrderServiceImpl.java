package com.oak.wxshop.orderservice;

import com.oak.wxshop.api.OrderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${wxshop.orderservice.version}")
public class OrderServiceImpl implements OrderService {
    @Override
    public void placeOrder(int goodsId, int number) {
        System.out.println("id:" + goodsId + ", number:" + number);
    }
}
