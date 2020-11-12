package com.choi.hangangsuon.api;


import com.choi.hangangsuon.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApiController {

    @GetMapping("/")
    public Response home(){
        return new Response("success", "User List",null);
    }
}
