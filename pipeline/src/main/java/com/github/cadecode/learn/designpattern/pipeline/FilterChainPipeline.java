package com.github.cadecode.learn.designpattern.pipeline;

import com.github.cadecode.learn.designpattern.pipeline.context.BizContext;

import java.util.Objects;

/**
 * 管道
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public class FilterChainPipeline<T extends BizFilter<A>, A extends BizContext> {

    private DefaultBizFilterChain<A> firstChain;
    private DefaultBizFilterChain<A> lastChain;

    public DefaultBizFilterChain<A> getFilterChain() {
        return firstChain;
    }

    public void addFilter(T filter) {
        DefaultBizFilterChain<A> newChain = new DefaultBizFilterChain<>(null, filter);
        if (Objects.isNull(firstChain)) {
            firstChain = newChain;
            lastChain = firstChain;
            return;
        }
        lastChain.setNextChain(newChain);
        lastChain = newChain;
    }

}
