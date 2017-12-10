package org.TeamS.sugar.service.impl;

import org.TeamS.sugar.entity.Sugar;
import org.TeamS.sugar.mapper.SugarFullMapper;
import org.TeamS.sugar.service.ISugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SugarService implements ISugarService {

    @Autowired
    private SugarFullMapper sugarFullMapper;

    @Override
    public List<Sugar> getSugarListByUserId(int userId) {
        List<Sugar> sugarList = sugarFullMapper.getListByUserId(userId);
        return sugarList;
    }
}
