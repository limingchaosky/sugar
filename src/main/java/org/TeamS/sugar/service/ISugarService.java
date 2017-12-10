package org.TeamS.sugar.service;

import org.TeamS.sugar.entity.Sugar;
import org.TeamS.sugar.entity.SugarFull;

import java.util.Date;
import java.util.List;

public interface ISugarService {

    List<SugarFull> getSugarFullListByUserId(int userId);

    List<SugarFull> getSugarFullListByUserIdAndDate(int userId, Date startDate, Date endDate);

    List<Sugar> getSugarListByUserId(int userId);
}
