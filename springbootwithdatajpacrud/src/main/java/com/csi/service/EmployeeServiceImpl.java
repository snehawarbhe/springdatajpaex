package com.csi.service;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired

    private EmployeeRepository employeeRepositoryImpl;

    public Employee signup(Employee employee) {
        return employeeRepositoryImpl.save(employee);

    }

    public boolean signIn(String empEmailId, String empPassword) {

        boolean flag = false;
        for (Employee employee : employeeRepositoryImpl.findAll()) {

            if (employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {

                flag = true;
                break;
            }
        }
        return flag;

    }

    public Optional<Employee> findById(int empId) {
        return employeeRepositoryImpl.findById(empId);

    }

    public List<Employee> findAll() {
        return employeeRepositoryImpl.findAll();

    }

    public Employee upDate(Employee employee) {
        return employeeRepositoryImpl.save(employee);

    }

    public void deleteById(int empId) {
        employeeRepositoryImpl.deleteById(empId);
    }

    public void deleteAll() {
        employeeRepositoryImpl.deleteAll();

    }
}
