package com.ecom.controller;

import com.ecom.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse HomecontrollerHandller(){
        ApiResponse resp1 = new ApiResponse();
        resp1.setMessage("GOD IS  GREAT nn");
        return resp1;
    }

}
