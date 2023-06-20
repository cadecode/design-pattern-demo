package com.github.cadecode.learn.designpattern.pipeline.business;

import com.github.cadecode.learn.designpattern.pipeline.BizFilterChain;
import com.github.cadecode.learn.designpattern.pipeline.business.enums.OrderCodeEnum;
import com.github.cadecode.learn.designpattern.pipeline.selector.LocalListFilterSelector;

import java.util.Arrays;
import java.util.List;

/**
 * 订单服务实现
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public class OrderServiceImpl implements OrderService {
    /**
     * 下单
     */
    @Override
    public void placeOrder(OrderParam orderParam) {
        // 需要启用的 filter
        List<String> filterNames = Arrays.asList(
                "QueryInfoFilter",
                "SaveInfoFilter"
        );
        LocalListFilterSelector filterSelector = new LocalListFilterSelector(filterNames);
        // 订单上下文，业务是 PLACE_ORDER
        OrderContext orderContext = new OrderContext(OrderCodeEnum.PLACE_ORDER, filterSelector);
        orderContext.setParam(orderParam);
        // 开始责任链处理
        BizFilterChain<OrderContext> filterChain = OrderPipelineConfig.pipeline().getFilterChain();
        filterChain.handle(orderContext);
    }
}
