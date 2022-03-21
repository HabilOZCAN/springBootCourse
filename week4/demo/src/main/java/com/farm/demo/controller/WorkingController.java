package com.farm.demo.controller;

import com.farm.demo.service.WorkingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/workingHours")
public class WorkingController {

    private final WorkingService workingService;

    public WorkingController(WorkingService workingHoursIncreaseService) {
        this.workingService = workingHoursIncreaseService;
    }

    @PatchMapping("/{id}")
    public ResponseEntity updateWorkingHours(
            @PathVariable("id") UUID id
    ){
        this.workingService.workingHoursIncrease(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
    @GetMapping("/{id}")
    public ResponseEntity getEarnedWage(
            @PathVariable("id") UUID id
    ){
        int wageResult = this.workingService.totalWage(id);
        return new ResponseEntity(
                "Your wage is " + wageResult,
                HttpStatus.OK);
    }
}
