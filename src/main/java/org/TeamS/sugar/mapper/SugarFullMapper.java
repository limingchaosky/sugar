package org.TeamS.sugar.mapper;

import org.TeamS.sugar.entity.Sugar;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SugarFullMapper {

    List<Sugar> getListByUserId(@Param(value = "userId") int userId);

    List<Sugar> getListByUserIdAndSugarDate(int userId, Date startTime, Date endTime);

}
