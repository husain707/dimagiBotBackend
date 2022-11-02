package com.example.dimagi.bot.repositories;

import com.example.dimagi.bot.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findByIsAvailable(boolean isAvailable);

}
