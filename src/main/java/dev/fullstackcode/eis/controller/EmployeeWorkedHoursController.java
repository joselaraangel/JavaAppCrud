package dev.fullstackcode.eis.controller;


import dev.fullstackcode.eis.entity.Employee_Worked_Hours;
import dev.fullstackcode.eis.service.EmployeeWorkedHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
@RequestMapping("/employeworkedhours")
public class EmployeeWorkedHoursController {

    @Autowired
    EmployeeWorkedHoursService workedService;


    @ResponseStatus(HttpStatus.CREATED) // send HTTP 201 instead of 200 as new object created
    @PostMapping
   // @RequestMapping(method=POST)
    public Employee_Worked_Hours createEmployeeWorkedHours(@RequestBody Employee_Worked_Hours worked) {

        return workedService.createEmployeeWorkedHours(worked);
    }


}

