package com.example.dimagi.bot.response;

import com.example.dimagi.bot.entities.Employee;
import com.example.dimagi.bot.enums.TaskTypes;

import java.util.List;

public class InOfficeResponse extends GeneralResponse{

    private List<Employee> availableEmployees;

    public InOfficeResponse(String status, List<Employee> availableEmployees) {
        super(status, TaskTypes.display);
        this.availableEmployees = availableEmployees;
    }

    public List<Employee> getAvailableEmployees() {
        return availableEmployees;
    }

    public void setAvailableEmployees(List<Employee> availableEmployees) {
        this.availableEmployees = availableEmployees;
    }
}
