package com.luopf.ssm.controller;

import com.luopf.ssm.common.utils.R;
import com.luopf.ssm.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goodsApi")
public class GoodsApiController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/queryGoods")
    @ResponseBody
    public R queryGoods(String name){
        return  R.ok(goodsService.queryGoodsByName(name));
    }


    @RequestMapping("/deletes")
    @ResponseBody
    public R deletes(@RequestBody List<Integer> ids){
        return  R.ok(goodsService.deletes(ids));
    }
}
