package org.TeamS.sugar.mapper;

import org.TeamS.sugar.entity.Sugar;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SugarMapper {

    List<Sugar> getListByUserId(@Param(value = "userId") int userId);

    List<Sugar> getListByUserIdAndSugarDate(@Param(value = "userId") int userId, @Param(value = "startTime") Date startTime, @Param(value = "endTime") Date endTime);

    List<Sugar> getListByUserIdAndSugarDateAndSugarType(@Param(value = "userId") int userId, List<String> sugarTypes, @Param(value = "startTime") Date startTime, @Param(value = "endTime") Date endTime);

}
