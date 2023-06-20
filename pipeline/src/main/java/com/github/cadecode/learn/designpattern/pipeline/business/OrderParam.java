package com.github.cadecode.learn.designpattern.pipeline.business;

import lombok.Data;

/**
 * 订单业务总参数
 *
 * @author Cade Li
 * @date 2023/6/20
 */
@Data
public class OrderParam {

    private Long goodId;

    private Long userId;
}
