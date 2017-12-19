package com.toby.scaffolding.controller.demo;

import com.toby.scaffolding.biz.u.IUserService;
import com.toby.scaffolding.controller.base.BaseController;
import com.toby.scaffolding.dto.base.Request;
import com.toby.scaffolding.dto.u.request.UserIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Toby
 * @Description
 * @date 2017-12-17 16:58:47
 */

@Slf4j
@RestController
public class RestApi extends BaseController{

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/t/{id}")
    public String selectById(@PathVariable Long id) {
        return "sucess";
    }

    @PostMapping(value = "/u")
    @ResponseBody
    public void postUser(@RequestBody
                         @Valid Request<UserIn> in, Errors errors) {
        if (errors.hasErrors()) {
            log.info(errors.getFieldError().getField()+": "+errors.getFieldError().getDefaultMessage());
        }
        log.info(String.valueOf(userService.saveUser(in.getBody())));
    }
}
