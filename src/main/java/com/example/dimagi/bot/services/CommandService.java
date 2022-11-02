package com.example.dimagi.bot.services;

import com.example.dimagi.bot.entities.BotCommand;
import com.example.dimagi.bot.entities.Employee;
import com.example.dimagi.bot.enums.TaskTypes;
import com.example.dimagi.bot.repositories.BotCommandRepository;
import com.example.dimagi.bot.repositories.EmployeeRepository;
import com.example.dimagi.bot.response.GeneralResponse;
import com.example.dimagi.bot.response.HelpResponse;
import com.example.dimagi.bot.response.InOfficeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private BotCommandRepository botCommandRepository;

    public GeneralResponse executeCommand(String command, List<String> args){

        if(command.equals("inoffice")){
            List<Employee> employees = employeeRepository.findByIsAvailable(true);
            return new InOfficeResponse("success", employees);
        }else if(command.equals("help")){
            List<BotCommand> commands;
            if(args != null && !args.isEmpty()){
                commands = new ArrayList<>();
                commands.add(botCommandRepository.findByName(args.get(0)));
            }else{
                commands = botCommandRepository.findAll();
            }
            return new HelpResponse("success", commands);
        }
        return new GeneralResponse("notFound", TaskTypes.display);
    }

}
