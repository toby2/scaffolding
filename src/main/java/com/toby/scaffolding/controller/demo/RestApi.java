package com.toby.scaffolding.controller.demo;

import com.sun.deploy.net.HttpResponse;
import com.toby.scaffolding.biz.u.IUserService;
import com.toby.scaffolding.dto.u.in.UserIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Toby
 * @Description
 * @date 2017-12-17 16:58:47
 */

@Slf4j
@RestController
public class RestApi {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/t/{id}")
    public String selectById(@PathVariable Long id) {
        return "sucess";
    }

    @PostMapping(value = "/u")
    @ResponseBody
    public void postUser(@RequestBody UserIn params) {
        userService.saveUser(params);
    }
}
