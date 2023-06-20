package com.github.cadecode.learn.designpattern.pipeline.context;

import com.github.cadecode.learn.designpattern.pipeline.enums.BizCode;
import com.github.cadecode.learn.designpattern.pipeline.selector.FilterSelector;

/**
 * 上下文抽象类
 *
 * @author Cade Li
 * @date 2023/6/20
 */
public abstract class AbstractBizContext implements BizContext {

    private final BizCode bizCode;
    private final FilterSelector filterSelector;

    public AbstractBizContext(BizCode bizCode, FilterSelector filterSelector) {
        this.bizCode = bizCode;
        this.filterSelector = filterSelector;
    }

    @Override
    public BizCode getBizCode() {
        return bizCode;
    }

    @Override
    public FilterSelector getFilterSelector() {
        return filterSelector;
    }

}
