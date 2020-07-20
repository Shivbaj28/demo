package com.boot.starter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.boot.starter.entity.Employee;


@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {	

}
