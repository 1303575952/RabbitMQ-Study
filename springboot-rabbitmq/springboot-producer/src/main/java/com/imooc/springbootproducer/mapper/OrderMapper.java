package com.imooc.springbootproducer.mapper;

import com.imooc.entity.Order;

public interface OrderMapper {
    int insert(Order record);
    int deleteByPrimaryKey(Integer id);
    int insertSelective(Order record);
    Order selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Order record);
    int updateByPrimaryKey(Order record);
}
