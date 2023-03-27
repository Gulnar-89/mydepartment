package com.example.department.services;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long department) {
        log.info("Inside findDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(department);
    }

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
