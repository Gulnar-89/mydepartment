package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment metod of DepartmentController ");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long department){
        log.info("Inside findDepartmentById metod of DepartmentController ");
        return departmentService.findDepartmentById(department);

    }
    @GetMapping
    public List<Department> findAll(){
     return departmentService.findAll();
    }

}
