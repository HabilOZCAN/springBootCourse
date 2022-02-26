package ch.worker;

import ch.worker.model.Worker;
import ch.worker.workers.WorkerChild;
import ch.worker.workers.WorkerDisabled;
import ch.worker.workers.WorkerGood;
import ch.worker.workers.WorkerLazy;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        int min = 2;
        int max = 6;
        int memberCount = (int) Math.floor(Math.random() * (max - min + 1) + min);
        List<Worker> workers = new ArrayList<>();

        for (int memberInx = 0; memberInx < memberCount; memberInx++) {
            int type = (int) Math.floor(Math.random() * (max - min ));
            switch (type) {
                case 0 -> workers.add(new WorkerChild());
                case 1 -> workers.add(new WorkerDisabled());
                case 2 -> workers.add(new WorkerLazy());
                case 3 -> workers.add(new WorkerGood());
            }
        }

        workers.forEach(Worker::toString);
        workers.forEach(ApplicationRunner::printWage);
        System.out.println("-----------AFTER ONE WEEK WORK-----------------");
        workers.forEach(Worker::works);
        workers.forEach(ApplicationRunner::printWage);
    }
    private static void printWage(Worker worker){
        System.out.println(worker);
        System.out.println("This worker totally Earned"+worker.getWageEarned()+"$");
    }
}

