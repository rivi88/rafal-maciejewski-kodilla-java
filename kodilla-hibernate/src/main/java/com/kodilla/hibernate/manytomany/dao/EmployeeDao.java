package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    List<Employee> findByLastName(String lastName);

}
