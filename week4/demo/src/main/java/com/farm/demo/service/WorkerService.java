package com.farm.demo.service;

import com.farm.demo.controller.model.WorkerView;
import com.farm.demo.persistence.entity.WorkerEntity;

import java.util.List;
import java.util.UUID;

public interface WorkerService {
    WorkerEntity createWorker(WorkerView personViewModel);

    WorkerEntity findWorker(UUID id);

    List<WorkerEntity> getListOfWorker();

    void deleteWorker(UUID id);
}
