package com.example.remotedb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.remotedb.entity.EmployeeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeeEntity, Integer>{

}
