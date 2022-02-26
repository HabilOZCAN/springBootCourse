package ch.worker.workers;

import ch.worker.model.Worker;

public class WorkerLazy extends Worker {

    public WorkerLazy() {
        super.type = "lazyWorker";
        super.wagePerHour = 23;
        super.workHoursPerWeek = 20;
    }

}
