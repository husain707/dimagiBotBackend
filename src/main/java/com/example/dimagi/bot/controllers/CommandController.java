package com.example.dimagi.bot.controllers;

import com.example.dimagi.bot.request.CommandRequest;
import com.example.dimagi.bot.response.GeneralResponse;
import com.example.dimagi.bot.services.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commands")
public class CommandController {

    @Autowired
    private CommandService service;

    @PostMapping("/execute")
    public GeneralResponse executeCommand(@RequestBody CommandRequest commandRequest){
        return service.executeCommand(commandRequest.getCommand(), commandRequest.getArgs());
    }

}
