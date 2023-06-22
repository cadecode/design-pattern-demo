package com.github.cadecode.learn.designpattern.pipeline.business;

import com.github.cadecode.learn.designpattern.pipeline.context.AbstractBizContext;
import com.github.cadecode.learn.designpattern.pipeline.enums.BizCode;
import com.github.cadecode.learn.designpattern.pipeline.selector.FilterSelector;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 订单业务上下文
 *
 * @author Cade Li
 * @date 2023/6/20
 */
@Getter
@Setter
@ToString
public class OrderContext extends AbstractBizContext {

    private boolean continueChain = true;

    private OrderParam param;

    private OrderModel model;


    public OrderContext(BizCode bizCode, FilterSelector filterSelector) {
        super(bizCode, filterSelector);
    }

    @Override
    public boolean continueChain() {
        return continueChain;
    }
}
