package com.farm.demo.controller.model.workers;

import com.farm.demo.controller.model.WorkerViewModel;

public class WorkerDisabledView extends WorkerViewModel {

    public WorkerDisabledView() {
    }

    public WorkerDisabledView(String firstName, String lastName, WorkerTypes type) {
        super(firstName, lastName, type);
    }
}
