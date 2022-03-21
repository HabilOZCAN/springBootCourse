package com.farm.demo.controller.model;

import com.farm.demo.controller.model.workers.WorkerTypes;

import java.util.UUID;

public interface WorkerView {

    UUID getId() ;
    String getFirstName() ;
    String getLastName() ;
    WorkerTypes getType();
    String toString();
}
