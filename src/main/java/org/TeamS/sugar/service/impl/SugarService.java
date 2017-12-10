package org.TeamS.sugar.service.impl;

import org.TeamS.sugar.entity.Sugar;
import org.TeamS.sugar.entity.SugarFull;
import org.TeamS.sugar.mapper.SugarFullMapper;
import org.TeamS.sugar.mapper.SugarMapper;
import org.TeamS.sugar.service.ISugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SugarService implements ISugarService {

    @Autowired
    private SugarFullMapper sugarFullMapper;

    @Autowired
    private SugarMapper sugarMapper;

    @Override
    public List<SugarFull> getSugarFullListByUserId(int userId) {
        List<SugarFull> sugarList = sugarFullMapper.getListByUserId(userId);
        return sugarList;
    }

    @Override
    public List<SugarFull> getSugarFullListByUserIdAndDate(int userId, Date startDate, Date endDate) {
        List<SugarFull> sugarList = sugarFullMapper.getListByUserIdAndSugarDate(userId, startDate, endDate);
        return sugarList;
    }

    public List<Sugar> getSugarListByUserId(int userId){
        List<Sugar> sugarList = sugarMapper.getListByUserId(userId);
        return sugarList;
    }
}
