package com.github.cadecode.learn.designpattern.pipeline.business;

import com.github.cadecode.learn.designpattern.pipeline.business.enums.OrderCodeEnum;
import com.github.cadecode.learn.designpattern.pipeline.enums.BizCode;
import com.github.cadecode.learn.designpattern.pipeline.selector.FilterSelector;
import com.github.cadecode.learn.designpattern.pipeline.selector.LocalListFilterSelector;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单业务 FilterSelector 工厂
 *
 * @author Cade Li
 * @since 2023/6/21
 */
public class OrderFilterSelectorFactory {

    private static final Map<BizCode, List<String>> FILTER_NAMES_MAP = new HashMap<>();

    static {
        // 此处可结合配置文件
        // 配置下单业务需要的 filter
        FILTER_NAMES_MAP.put(OrderCodeEnum.PLACE_ORDER, Arrays.asList(
                "SaveOrderFilter",
                "QueryOrderFilter",
                "CheckOrderFilter",
                "UserPayWayFilter"
        ));
    }

    public static FilterSelector getFilterSelector(OrderCodeEnum orderCode) {
        if (!FILTER_NAMES_MAP.containsKey(orderCode)) {
            throw new UnsupportedOperationException("不支持的订单业务代码");
        }
        return new LocalListFilterSelector(FILTER_NAMES_MAP.get(orderCode));
    }
}
