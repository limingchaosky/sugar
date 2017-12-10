package org.TeamS.sugar.controller;

import org.TeamS.sugar.entity.Sugar;
import org.TeamS.sugar.service.ISugarService;
import org.TeamS.sugar.utils.SugarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/sugar")
public class SugarController {

    @Autowired
    private ISugarService sugarService;

    @ResponseBody
    @RequestMapping(value = "/getUserAllSugarData")
    public SugarResult getUserAllSugarData(String userId){
        int userIdInt = -1;
        try {
            userIdInt = Integer.parseInt(userId);
        }catch (Exception e) {
        }
        if (userIdInt == -1) {
            return SugarResult.build(500,"用户Id错误！");
        } else {
            List<Sugar> sugarList = sugarService.getSugarListByUserId(userIdInt);
            return SugarResult.ok(sugarList);
        }
    }

}
