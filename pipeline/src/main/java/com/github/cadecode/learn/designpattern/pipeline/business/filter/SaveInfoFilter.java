package com.github.cadecode.learn.designpattern.pipeline.business.filter;

import cn.hutool.core.lang.Console;
import com.github.cadecode.learn.designpattern.pipeline.AbstractBizFilter;
import com.github.cadecode.learn.designpattern.pipeline.business.OrderContext;

/**
 * 保存消息的过滤器
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public class SaveInfoFilter extends AbstractBizFilter<OrderContext> {
    @Override
    public void handle(OrderContext context) {
        Console.log("保存订单信息, {}", context);
    }
}

