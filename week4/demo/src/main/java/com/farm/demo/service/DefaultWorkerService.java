package com.farm.demo.service;

import com.farm.demo.controller.model.WorkerView;
import com.farm.demo.persistence.entity.WorkerEntity;
import com.farm.demo.persistence.entity.workerentities.ChildWorkerEntity;
import com.farm.demo.persistence.entity.workerentities.DisabledWorkerEntity;
import com.farm.demo.persistence.entity.workerentities.GoodWorkerEntity;
import com.farm.demo.persistence.entity.workerentities.LazyWorkerEntity;
import com.farm.demo.persistence.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DefaultWorkerService implements WorkerService{

    private final WorkerRepository workerRepository;

    public DefaultWorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public WorkerEntity createWorker(WorkerView workerViewModel) {

        switch (workerViewModel.getType()) {
            case ChildWorker -> {
                return this.workerRepository.save(new ChildWorkerEntity(
                        workerViewModel.getId(),
                        workerViewModel.getFirstName(),
                        workerViewModel.getLastName(),
                        workerViewModel.getType()));
            }
            case DisabledWorker -> {
                return this.workerRepository.save(new DisabledWorkerEntity(
                        workerViewModel.getId(),
                        workerViewModel.getFirstName(),
                        workerViewModel.getLastName(),
                        workerViewModel.getType()));
            }
            case GoodWorker -> {
                return this.workerRepository.save(new GoodWorkerEntity(
                        workerViewModel.getId(),
                        workerViewModel.getFirstName(),
                        workerViewModel.getLastName(),
                        workerViewModel.getType()));
            }
            case LazyWorker -> {
                return this.workerRepository.save(new LazyWorkerEntity(
                        workerViewModel.getId(),
                        workerViewModel.getFirstName(),
                        workerViewModel.getLastName(),
                        workerViewModel.getType()));
            }
            default -> throw new IllegalStateException("Unexpected value: " + workerViewModel.getType());
        }

    }

    @Override
    public WorkerEntity findWorker(UUID id) {
        return this.workerRepository.findById(id).get();
    }

    @Override
    public List<WorkerEntity> getListOfWorker() {
        return (List<WorkerEntity>) this.workerRepository.findAll();
    }

    @Override
    public void deleteWorker(UUID id) {
        this.workerRepository.deleteById(id);

    }
}
