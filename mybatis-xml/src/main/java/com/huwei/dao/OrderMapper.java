package com.huwei.dao;

import org.apache.ibatis.annotations.Mapper;
import com.huwei.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * Created by    huwei on 2017/7/24.
        */
@Mapper
public interface OrderMapper {
    Order queryOrderById(@Param("id") Integer id);
    int save(Order order);
}
