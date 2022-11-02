package com.example.dimagi.bot.request;

import java.io.Serializable;
import java.util.List;

public class CommandRequest implements Serializable {

    private String command;
    private List<String> args;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }
}
