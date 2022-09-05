package com.example.task_01.models;

public class Reply {

    private String name;

    private String timeOfDay;

    public Reply(String name, String timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public Reply() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}


