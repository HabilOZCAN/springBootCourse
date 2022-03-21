package com.farm.demo.service;

import com.farm.demo.persistence.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DefaultWorkingService implements WorkingService{

    private final WorkerRepository workerRepository;

    public DefaultWorkingService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public void workingHoursIncrease(UUID id) {
        this.workerRepository.findById(id).get().setTotalWorkedHours();
    }

    @Override
    public int totalWage(UUID id) {
        return this.workerRepository.findById(id).get().getWageEarned();
    }
}
