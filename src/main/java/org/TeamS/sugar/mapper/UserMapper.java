package org.TeamS.sugar.mapper;

import org.TeamS.sugar.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUserById(@Param(value = "id") String id);
}
