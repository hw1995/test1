package com.huwei.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by huwei on 2017/7/24.
 */
@Data
public class OrderLine {
    private Integer id;
    private String productName;
    private BigDecimal productPrice;
    private Integer productQty;
    private Order order;
}
