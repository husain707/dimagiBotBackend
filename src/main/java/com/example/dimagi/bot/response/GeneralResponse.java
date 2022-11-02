package com.example.dimagi.bot.response;

import com.example.dimagi.bot.enums.TaskTypes;

public class GeneralResponse {

    private String status;
    private TaskTypes taskType;

    public GeneralResponse(String status, TaskTypes taskType) {
        this.status = status;
        this.taskType = taskType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskTypes getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypes taskType) {
        this.taskType = taskType;
    }
}
