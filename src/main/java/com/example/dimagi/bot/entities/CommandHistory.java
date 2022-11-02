package com.example.dimagi.bot.entities;

import javax.persistence.*;

@Entity(name = "command_history")
public class CommandHistory {

    @Id
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commandId;
    @Column
    private String commandStatement;
    @Column
    private int employeeId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommandId() {
        return commandId;
    }

    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    public String getCommandStatement() {
        return commandStatement;
    }

    public void setCommandStatement(String commandStatement) {
        this.commandStatement = commandStatement;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
