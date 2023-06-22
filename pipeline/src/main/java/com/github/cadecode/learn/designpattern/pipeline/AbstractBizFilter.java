package com.github.cadecode.learn.designpattern.pipeline;

import com.github.cadecode.learn.designpattern.pipeline.context.BizContext;

/**
 * 过滤器抽象
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public abstract class AbstractBizFilter<T extends BizContext> implements BizFilter<T> {

    /**
     * 过滤方法模板
     */
    @Override
    public void doFilter(T context, BizFilterChain<T> filterChain) {
        // 如果包含该 filter
        if (context.getFilterSelector().matchFilter(this.getClass().getSimpleName())) {
            handle(context);
        }
        if (context.continueChain()) {
            filterChain.next(context);
        }
    }

    /**
     * 过滤处理主逻辑
     */
    public abstract void handle(T context);
}
