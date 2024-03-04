package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/signup")

    public ResponseEntity<Employee> signUp(@RequestBody Employee employee) {

        return ResponseEntity.ok(employeeServiceImpl.signup(employee));
    }

    @GetMapping("/signin/{email}/{pwd}")

    public ResponseEntity<Boolean> signIn(@PathVariable String email, @PathVariable String pwd) {
        return ResponseEntity.ok(employeeServiceImpl.signIn(email, pwd));

    }

    @GetMapping("/findbyid/{empid}")

    public ResponseEntity<Optional<Employee>> findById(@PathVariable int empid) {
        return ResponseEntity.ok(employeeServiceImpl.findById(empid));
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeServiceImpl.findAll());

    }

    @PutMapping("/update/{empid}")

    public ResponseEntity<Employee> update(@PathVariable int empid, @io.swagger.v3.oas.annotations.parameters.RequestBody Employee employee) {
        return ResponseEntity.ok(employeeServiceImpl.upDate(employee));

    }

    @DeleteMapping("/deletebyid/{empid}")

    public ResponseEntity<String> deleteById(@PathVariable int empid) {
        employeeServiceImpl.deleteById(empid);
        return ResponseEntity.ok("DATA DELETED SUCCESSFULLY");
    }
}
