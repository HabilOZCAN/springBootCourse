package ch.worker.workers;

import ch.worker.model.Worker;

public class WorkerChild extends Worker {

    public WorkerChild() {
        super.type = "childWorker";
        super.wagePerHour = 10;
        super.workHoursPerWeek = 30;
    }
}

