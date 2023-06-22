package com.github.cadecode.learn.designpattern.pipeline;

import com.github.cadecode.learn.designpattern.pipeline.business.OrderParam;
import com.github.cadecode.learn.designpattern.pipeline.business.OrderServiceImpl;
import org.junit.Test;

/**
 * 测试
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public class PipelineTests {

    // 此处配合容器可注入
    private final OrderServiceImpl orderService = new OrderServiceImpl();

    /**
     * 下单
     */
    @Test
    public void testPlaceOrder() {
        // 构造参数
        OrderParam orderParam = new OrderParam();
        orderParam.setGoodId(10001L);
        orderParam.setUserId(1L);
        // 责任链处理
        orderService.placeOrder(orderParam);
    }
}
