package com.farm.demo.controller;

import com.farm.demo.controller.model.WorkerView;
import com.farm.demo.controller.model.WorkerViewModel;
import com.farm.demo.persistence.entity.WorkerEntity;
import com.farm.demo.service.WorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) { this.workerService = workerService; }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WorkerEntity>> getListOfWorkers(){
        System.out.println("get list of worker");
        List<WorkerEntity> workerEntityList = this.workerService.getListOfWorker();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(workerEntityList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkerEntity> getWorkerById(@PathVariable("id") UUID id){
        System.out.println("get a worker by his/her id");
        // get info from database
        WorkerEntity existingWorkerEntity = this.workerService.findWorker(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(existingWorkerEntity);
    }

    @PostMapping
    public ResponseEntity createWorker(@RequestBody WorkerViewModel workerViewModel){
        System.out.println("create a new Worker" + workerViewModel);
        // save info into database
        WorkerEntity newWorkerEntity = this.workerService.createWorker(workerViewModel);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newWorkerEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePersonById(@PathVariable("id") UUID id){
        System.out.println("delete person!");
        // delete entity via service from the database
        this.workerService.deleteWorker(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

}
