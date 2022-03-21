package com.farm.demo.persistence.repository;

import com.farm.demo.persistence.entity.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface WorkerRepository extends CrudRepository<WorkerEntity, UUID> {

}
