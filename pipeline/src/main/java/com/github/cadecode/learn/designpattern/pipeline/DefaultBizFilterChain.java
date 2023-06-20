package com.github.cadecode.learn.designpattern.pipeline;

import com.github.cadecode.learn.designpattern.pipeline.context.BizContext;
import lombok.Setter;

import java.util.Objects;

/**
 * 过滤器链默认实现
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public class DefaultBizFilterChain<T extends BizContext> implements BizFilterChain<T> {

    @Setter
    private BizFilterChain<T> nextChain;
    private final BizFilter<T> filter;

    public DefaultBizFilterChain(BizFilterChain<T> nextChain, BizFilter<T> filter) {
        this.nextChain = nextChain;
        this.filter = filter;
    }


    @Override
    public void handle(T context) {
        filter.doFilter(context, this);
    }

    @Override
    public void next(T context) {
        if (Objects.nonNull(this.nextChain)) {
            this.nextChain.handle(context);
        }
    }
}
