package ch.worker.model;

import java.util.UUID;

public abstract class Worker implements WorkerInterface{

    protected final UUID controlNumber = UUID.randomUUID();

    protected int workHoursPerWeek;

    private int totalWorkedHours = 0;

    protected String type;

    protected int wagePerHour;

    private int wageEarned = 0;


    @Override
    public String toString() {
        return "Worker{" +"with controlNumber=" + controlNumber +
                ", type='" + type + '\'' +
                ", works per week=" + workHoursPerWeek + "hrs"+
                ", with wage per hour=" + wagePerHour +"$"+
                '}';
    }


    @Override
    public int getWageEarned(){
        return this.wageEarned;
    }

    @Override
    public void works() {
        this.totalWorkedHours += this.workHoursPerWeek;
        this.wageEarned = calculateTotalWage();
    }

    private int calculateTotalWage() {
        return this.wagePerHour*this.totalWorkedHours;
    }
}

