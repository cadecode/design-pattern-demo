package com.github.cadecode.learn.designpattern.pipeline;

import com.github.cadecode.learn.designpattern.pipeline.context.BizContext;

/**
 * 过滤器链接口
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public interface BizFilterChain<T extends BizContext> {

    void filter(T context);

    void next(T context);
}
