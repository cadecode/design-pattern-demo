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
public class PipeLineTests {

    /**
     * 下单
     */
    @Test
    public void testPlaceOrder() {
        OrderParam orderParam = new OrderParam();
        orderParam.setGoodId(10001L);
        orderParam.setUserId(1L);
        new OrderServiceImpl().placeOrder(orderParam);
    }
}
