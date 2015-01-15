package com.hanzikids.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/demo")
public class AppController {

    @RequestMapping(value = "/code")
    public @ResponseBody AppResponse getCode(){
        AppResponse response = new AppResponse();
        response.setCode("success");
        return response;
    }
}
