package com.huwei.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huwei on 2017/7/24.
 */
@Data
public class Order {
    private Integer id;
    private String orderNo;
    private String operName;
    private List<OrderLine> orderLines;
}
