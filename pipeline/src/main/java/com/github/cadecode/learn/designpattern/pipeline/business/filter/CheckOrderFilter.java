package com.github.cadecode.learn.designpattern.pipeline.business.filter;

import com.github.cadecode.learn.designpattern.pipeline.AbstractBizFilter;
import com.github.cadecode.learn.designpattern.pipeline.business.OrderContext;

/**
 * 校验订单
 *
 * @author Cade Li
 * @since 2023/6/21
 */
public class CheckOrderFilter extends AbstractBizFilter<OrderContext> {
    @Override
    public void handle(OrderContext context) {
        // 随机值模拟失败
        if (Math.random() < 0.5) {
            System.out.println("校验订单信息，未通过");
            context.setContinueChain(false);
        } else {
            System.out.println("校验订单信息, 通过");
        }
    }
}

