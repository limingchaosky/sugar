package org.TeamS.sugar.controller;

import org.TeamS.sugar.entity.Sugar;
import org.TeamS.sugar.entity.SugarFull;
import org.TeamS.sugar.service.ISugarService;
import org.TeamS.sugar.utils.SugarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/sugar")
public class SugarController {

    @Autowired
    private ISugarService sugarService;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @ResponseBody
    @RequestMapping(value = "/getUserAllSugarFullData")
    public SugarResult getUserAllSugarFullData(String userId){
        int userIdInt = -1;
        try {
            userIdInt = Integer.parseInt(userId);
        }catch (Exception e) {
        }
        if (userIdInt == -1) {
            return SugarResult.build(500,"用户Id转化错误！");
        } else {
            List<SugarFull> sugarList = sugarService.getSugarFullListByUserId(userIdInt);
            return SugarResult.ok(sugarList);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getUserSugarFullDate")
    public SugarResult getUserSugarFullDate(String userId, String start, String end){
        int userIdInt = -1;
        Date startTime;
        Date endTime;
        try {
            userIdInt = Integer.parseInt(userId);
            startTime = sdf.parse(start);
            endTime = sdf.parse(end);
        }catch (Exception e){
            return SugarResult.build(500,"参数转换错误！",e);
        }

        List<SugarFull> sugarList = sugarService.getSugarFullListByUserIdAndDate(userIdInt, startTime, endTime);
        return SugarResult.ok(sugarList);
    }

    @ResponseBody
    @RequestMapping(value = "/getUserAllSugarData")
    public SugarResult getUserAllSugarData(String userId){
        int userIdInt = -1;
        try {
            userIdInt = Integer.parseInt(userId);
        }catch (Exception e) {
        }
        if (userIdInt == -1) {
            return SugarResult.build(500,"用户Id转化错误！");
        } else {
            List<Sugar> sugarList = sugarService.getSugarListByUserId(userIdInt);
            return SugarResult.ok(sugarList);
        }
    }

}
