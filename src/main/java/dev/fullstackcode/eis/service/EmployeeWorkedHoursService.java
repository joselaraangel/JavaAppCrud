package dev.fullstackcode.eis.service;


import dev.fullstackcode.eis.entity.Employee_Worked_Hours;
import dev.fullstackcode.eis.repository.EmployeeWorkedHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmployeeWorkedHoursService {

    @Autowired
    EmployeeWorkedHoursRepository workedRepository;
    
    public Employee_Worked_Hours createEmployeeWorkedHours(Employee_Worked_Hours worked) {
        return workedRepository.save(worked);
    }

}

