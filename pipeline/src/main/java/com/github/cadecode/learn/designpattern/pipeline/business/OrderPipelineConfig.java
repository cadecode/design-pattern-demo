package com.github.cadecode.learn.designpattern.pipeline.business;

import com.github.cadecode.learn.designpattern.pipeline.BizFilter;
import com.github.cadecode.learn.designpattern.pipeline.FilterChainPipeline;
import com.github.cadecode.learn.designpattern.pipeline.business.filter.QueryInfoFilter;
import com.github.cadecode.learn.designpattern.pipeline.business.filter.SaveInfoFilter;

/**
 * 订单业务 pipeline 单例类
 * 若使用 Spring 容器，可直接注入到容器中使用
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public class OrderPipelineConfig {

    private OrderPipelineConfig() {

    }

    public static FilterChainPipeline<BizFilter<OrderContext>, OrderContext> pipeline() {
        return OrderPipelineHolder.PIPELINE;
    }

    private static class OrderPipelineHolder {

        private static final FilterChainPipeline<BizFilter<OrderContext>, OrderContext> PIPELINE;

        static {
            PIPELINE = new FilterChainPipeline<>();
            PIPELINE.addFilter(new QueryInfoFilter());
            PIPELINE.addFilter(new SaveInfoFilter());
        }

    }

}
