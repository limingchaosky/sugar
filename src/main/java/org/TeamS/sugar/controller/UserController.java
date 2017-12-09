package org.TeamS.sugar.controller;

import org.TeamS.sugar.entity.User;
import org.TeamS.sugar.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/getUserById")
    public String getUserById(String id) {

        User user = userService.getUserById(id);

        return user.toString();
    }

}
