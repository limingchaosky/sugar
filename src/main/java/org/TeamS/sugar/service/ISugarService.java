package org.TeamS.sugar.service;

import org.TeamS.sugar.entity.SugarFull;

import java.util.Date;
import java.util.List;

public interface ISugarService {

    List<SugarFull> getSugarListByUserId(int userId);

    List<SugarFull> getSugarListByUserIdAndDate(int userId, Date startDate, Date endDate);
}
