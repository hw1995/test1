package com.huwei.dao;

import com.huwei.domain.OrderLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by huwei on 2017/7/24.
 */
@Mapper
public interface OrderLineMapper {
    void batchSave(List<OrderLine> orderLines);
}
