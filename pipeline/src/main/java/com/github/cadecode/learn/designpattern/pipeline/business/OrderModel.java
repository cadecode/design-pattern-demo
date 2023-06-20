package com.github.cadecode.learn.designpattern.pipeline.business;

import com.github.cadecode.learn.designpattern.pipeline.business.bean.Good;
import com.github.cadecode.learn.designpattern.pipeline.business.bean.User;
import lombok.Data;

/**
 * 订单业务总模型
 *
 * @author Cade Li
 * @date 2023/6/20
 */
@Data
public class OrderModel {

    private Good good;

    private User user;
}
