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
    private BizFilterChain<T> next;
    private final BizFilter<T> filter;

    public DefaultBizFilterChain(BizFilterChain<T> next, BizFilter<T> filter) {
        this.next = next;
        this.filter = filter;
    }


    /**
     * 当前 filter 处理
     */
    @Override
    public void filter(T context) {
        filter.doFilter(context, this);
    }

    /**
     * 下一 filter 处理
     */
    @Override
    public void next(T context) {
        if (Objects.nonNull(this.next)) {
            this.next.filter(context);
        }
    }
}
