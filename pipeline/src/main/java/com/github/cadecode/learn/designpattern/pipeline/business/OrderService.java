package com.github.cadecode.learn.designpattern.pipeline.business;

/**
 * 订单服务
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public interface OrderService {

    void placeOrder(OrderParam orderParam);
}
