package com.example.remotedb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.remotedb.entity.EmployeeeEntity;
import com.example.remotedb.repos.EmployeeRepo;

@RestController
@RequestMapping("/remotedb")
public class DBTestController {

	@Autowired
	EmployeeRepo repo;

	@PostMapping("/postData")
	ResponseEntity<String> putData(@RequestBody EmployeeeEntity ent) {

		EmployeeeEntity ent2 = repo.save(ent);

		return ResponseEntity.status(HttpStatus.CREATED).body("done");

	}
	
	@GetMapping("/getData")
	ResponseEntity<EmployeeeEntity> getData(@RequestParam String id){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(repo.findById(Integer.parseInt(id)).get());
	}

}
