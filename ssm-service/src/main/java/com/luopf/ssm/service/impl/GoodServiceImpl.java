package com.luopf.ssm.service.impl;

import org.apache.commons.lang3.StringUtils;
import com.luopf.ssm.dao.GoodsDao;
import com.luopf.ssm.entity.Goods;
import com.luopf.ssm.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    public List<Goods> queryGoodsByName(String name) {
        if(StringUtils.isEmpty(name)){
            name=null;
        }
        return goodsDao.getAll(name);
    }

    public int deletes(List<Integer> ids) {
        if(ids==null||ids.size()<=0) {
            return 0;
        }
        return goodsDao.deleteByIds(ids);
    }
}
