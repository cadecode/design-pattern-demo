package com.github.cadecode.learn.designpattern.pipeline.business.enums;

import com.github.cadecode.learn.designpattern.pipeline.enums.BizCode;
import lombok.Getter;

/**
 * 订单业务代码枚举
 *
 * @author Cade Li
 * @date 2023/6/20
 */
@Getter
public enum OrderCodeEnum implements BizCode {

    /**
     * 下单业务
     */
    PLACE_ORDER("PLACE_ORDER"),
    ;

    private final String code;

    OrderCodeEnum(String code) {
        this.code = code;
    }
}
