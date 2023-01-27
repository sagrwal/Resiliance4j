package com.primesoft.department.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.department.service.entity.Department;
import com.primesoft.department.service.server.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	
	@PostMapping("/")
	public Department saveDepatment(@RequestBody Department dept) {
		log.info("Inside saveDepartment method of DepartmentController");
		 return deptService.saveDepartment(dept);
	}
	
	@GetMapping("/{id}")
	public Department findDepatmentById(@PathVariable("id") Integer deptId){
		log.info("Inside findDepartmentById method of departmentController");
		return deptService.findDepartmentById(deptId);
	}
	

		
	}

