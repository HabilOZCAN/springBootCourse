package ch.worker.workers;

import ch.worker.model.Worker;

public class WorkerGood extends Worker {

    public WorkerGood() {
        super.type = "goodWorker";
        super.wagePerHour = 40;
        super.workHoursPerWeek = 40;
    }

}
