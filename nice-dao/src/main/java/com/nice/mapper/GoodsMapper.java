package com.nice.mapper;

import com.nice.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
    void addGoods(Goods goods);
}
