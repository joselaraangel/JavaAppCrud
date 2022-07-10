package dev.fullstackcode.eis.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Employee_Worked_Hours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer employee_id;
    private Integer worked_hours;
    private Date worked_date;


    public Employee_Worked_Hours() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployee() {
        return employee_id;
    }

    public void setEmployee(Integer employee_id) {
        this.employee_id = employee_id;
    }
    
    public Integer getWorkedHours() {
        return worked_hours;
    }

    public void setWorkedHours(Integer worked_hours) {
        this.worked_hours = worked_hours;
    }

    public Date getWorkedDate() {
        return worked_date;
    }

    public void setWorkedDate(Date worked_date) {
        this.worked_date = worked_date;
    }

}