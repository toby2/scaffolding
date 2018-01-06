package com.toby.scaffolding.controller.demo;

import com.toby.scaffolding.biz.u.IUserService;
import com.toby.scaffolding.controller.base.BaseController;
import com.toby.scaffolding.dto.base.request.Request;
import com.toby.scaffolding.dto.base.response.Response;
import com.toby.scaffolding.dto.base.response.ResponseCode;
import com.toby.scaffolding.dto.u.request.UserP;
import com.toby.scaffolding.dto.u.request.UserQo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Toby
 * @Description
 * @date 2017-12-17 16:58:47
 */

@Slf4j
@RestController
public class RestApi extends BaseController {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "/t")
    @ResponseBody
    public Response query(@RequestBody
                          @Valid Request<UserQo> in) {
        return Response.getInstance(userService.getBySelective(in.getBody()));
    }

    @GetMapping(value = "/t/{id}")
    public String selectById(@PathVariable Long id) {
        return "sucess";
    }

    @PostMapping(value = "/u")
    @ResponseBody
    public void postUser(@RequestBody
                         @Valid Request<UserP> in) {
        log.info(String.valueOf(userService.saveUser(in.getBody())));
    }
}
