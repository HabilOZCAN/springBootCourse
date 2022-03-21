package com.farm.demo.controller.model;

import com.farm.demo.controller.model.workers.*;
//import com.fasterxml.jackson.annotation.JsonSubTypes;


import java.util.UUID;

//@JsonSubTypes(
//        {
//                @JsonSubTypes.Type(value = WorkerChildView.class, name = "child"),
//                @JsonSubTypes.Type(value = WorkerDisabledView.class, name = "disabled"),
//                @JsonSubTypes.Type(value = WorkerGoodView.class, name = "good"),
//                @JsonSubTypes.Type(value = WorkerLazyView.class, name = "lazy")
//        })
public class WorkerViewModel implements WorkerView{

    protected UUID id = UUID.randomUUID();

    protected String firstName;

    protected String lastName;

    protected WorkerTypes type;

    protected int workHoursPerWeek;

    protected int wagePerHour;

    protected int totalWorkedHours;

    protected int wageEarned;

    public WorkerViewModel() {
    }

    public WorkerViewModel(String firstName, String lastName, WorkerTypes type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public WorkerTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", type='" + type + '\''+
                '}';
    }
}
