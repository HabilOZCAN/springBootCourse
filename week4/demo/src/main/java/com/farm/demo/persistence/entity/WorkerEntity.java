package com.farm.demo.persistence.entity;

import com.farm.demo.controller.model.workers.WorkerTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class WorkerEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected UUID id;

    protected String firstName;

    protected String lastName;

    protected int workHoursPerWeek;

    private int totalWorkedHours = 0;

    protected WorkerTypes type;

    protected int wagePerHour;

    private int wageEarned = 0;

    public WorkerEntity(){}

    public WorkerEntity(UUID id, String firstName, String lastName, WorkerTypes type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

    public void setTotalWorkedHours() {
        this.totalWorkedHours += this.workHoursPerWeek;
        this.wageEarned = this.totalWorkedHours*this.wagePerHour;
    }

    public int getWageEarned(){
        return this.wageEarned;
    }
}
