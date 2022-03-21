package com.farm.demo.persistence.entity.workerentities;

import com.farm.demo.controller.model.workers.WorkerTypes;
import com.farm.demo.persistence.entity.WorkerEntity;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class DisabledWorkerEntity extends WorkerEntity {
    public DisabledWorkerEntity(UUID id, String firstName, String lastName, WorkerTypes type) {
        super.id = id;
        super.firstName = firstName;
        super.lastName = lastName;
        super.type = type;
        super.wagePerHour = 10;
        super.workHoursPerWeek = 30;
    }
}
