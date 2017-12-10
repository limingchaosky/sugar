package org.TeamS.sugar.service;

import org.TeamS.sugar.entity.Sugar;

import java.util.List;

public interface ISugarService {

    List<Sugar> getSugarListByUserId(int userId);

}
