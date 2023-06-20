package com.github.cadecode.learn.designpattern.pipeline;

import com.github.cadecode.learn.designpattern.pipeline.context.BizContext;

/**
 * 过滤器接口
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public interface BizFilter<T extends BizContext> {

    void doFilter(T context, BizFilterChain<T> filterChain);
}
