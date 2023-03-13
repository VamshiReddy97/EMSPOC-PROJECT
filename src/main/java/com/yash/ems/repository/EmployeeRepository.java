package com.yash.ems.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yash.ems.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
	public List<Employee>findBycurrentAllocationContaining(String currentAllocation);
	
	public Employee findByEmployeeIdAndEmployeeName(Integer employeeId, String employeeName);
	
	/*
	 * @Query(value =
	 * "SELECT * FROM employee WHERE employeeName = ?1 AND employeeId = ?2",
	 * nativeQuery = true) Employee getEmployeeByEmployeeNameAndEmployeeId(String
	 * employeeName, String employeeId);
	 */
}
