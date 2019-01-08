package com.nice.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nice.domain.Goods;
import com.nice.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author nice
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Reference(
         version = "${dubbo.application.version}",
         application = "${dubbo.application.id}",
         registry = "${dubbo.registry.id}"
    )
    private GoodsService goodsService;

    @GetMapping("/add")
    @ResponseBody
    public void addGoods(Goods goods){
        goodsService.addGoods(goods);
    }
}
