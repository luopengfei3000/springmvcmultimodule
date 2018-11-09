package com.luopf.ssm.service;

import com.luopf.ssm.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> queryGoodsByName(String name);

    int deletes(List<Integer> ids);
}
