package com.nice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.nice.domain.Goods;
import com.nice.mapper.GoodsMapper;
import com.nice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author nice
 */
@Component
@Service(
        version = "${dubbo.application.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}",
        timeout = 600000
)
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    public void addGoods(Goods goods) {
        goodsMapper.addGoods(goods);
    }
}
