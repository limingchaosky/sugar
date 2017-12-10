package org.TeamS.sugar.mapper;

import org.TeamS.sugar.entity.SugarFull;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SugarFullMapper {

    List<SugarFull> getListByUserId(@Param(value = "userId") int userId);

    List<SugarFull> getListByUserIdAndSugarDate(@Param(value = "userId") int userId, @Param(value = "startTime") Date startTime, @Param(value = "endTime") Date endTime);

}
