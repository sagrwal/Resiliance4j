package com.primesoft.department.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.primesoft.department.service.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	Department findByDepartmentId(Integer deptId);

}
