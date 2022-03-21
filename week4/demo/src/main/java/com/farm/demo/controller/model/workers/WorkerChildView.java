package com.farm.demo.controller.model.workers;

import com.farm.demo.controller.model.WorkerViewModel;


public class WorkerChildView  extends WorkerViewModel {

    public WorkerChildView() {
    }

    public WorkerChildView(String firstName, String lastName, WorkerTypes type) {
        super(firstName, lastName, type);
    }

}
