/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.fullstackcode.eis.repository;
import dev.fullstackcode.eis.entity.Employee_Worked_Hours;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author JOSE ANGEL
 */
public interface  EmployeeWorkedHoursRepository extends JpaRepository<Employee_Worked_Hours,Integer> {
    
}
