package com.praveen.service;

import com.praveen.entity.Employee;
import com.praveen.repo.EmployeeRepo;
import com.praveen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public  void saveEmployee(Employee employee) {
        repo.save(employee);
    }
}
