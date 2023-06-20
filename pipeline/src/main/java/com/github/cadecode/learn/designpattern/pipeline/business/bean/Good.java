package com.github.cadecode.learn.designpattern.pipeline.business.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品
 *
 * @author Cade Li
 * @date 2023/6/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Good {

    private Long id;

    private String name;

    private String price;
}
