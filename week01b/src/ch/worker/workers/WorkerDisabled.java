package ch.worker.workers;


import ch.worker.model.Worker;

public class WorkerDisabled extends Worker {

    public WorkerDisabled() {
        super.type = "disabledWorker";
        super.wagePerHour = 10;
        super.workHoursPerWeek = 10;
    }
}
