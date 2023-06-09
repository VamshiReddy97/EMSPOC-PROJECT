package com.yash.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ems.model.EmployeeFile;

@Repository
public interface EmployeeFileRepository extends JpaRepository<EmployeeFile, Integer> {

}
