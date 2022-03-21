package com.farm.demo.controller.model.workers;

import com.farm.demo.controller.model.WorkerViewModel;

public class WorkerLazyView extends WorkerViewModel {

    public WorkerLazyView() {
    }

    public WorkerLazyView(String firstName, String lastName, WorkerTypes type) {
        super(firstName, lastName, type);
    }
}
