package com.hamitmizrak.ui.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hamitmizrak.business.dto.EmployeeDto;
import com.hamitmizrak.business.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeRestController {


	@Autowired
	public EmployeeServices employeeServices;

	//GET LIST
	// http://localhost:8080/api/v1/employees
	// get all employees
	@GetMapping("/employees")
	public List<EmployeeDto> getAllEmployees() {
		List<EmployeeDto> teacherDto = (List<EmployeeDto>) employeeServices.getAllEmployees();
		return teacherDto;
	}


	// http://localhost:8080/api/v1/employees/1
	// get employee by id rest api
	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
		List<EmployeeDto> teacherDto = (List<EmployeeDto>) employeeServices.getAllEmployees();
		return ResponseEntity.ok(teacherDto.get(0));
	}

	//POST
	// http://localhost:8080/api/v1/employees
	// create employee rest api
	@PostMapping("/employees")
	public EmployeeDto createEmployee(@RequestBody EmployeeDto teacherDto) {
		employeeServices.createEmployee(teacherDto);
		return teacherDto;
	}



	// http://localhost:8080/api/v1/employees
	// update employee rest api
	@PutMapping("/employees/{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDetails){
		employeeServices.updateEmployee(id,employeeDetails);
		return ResponseEntity.ok(employeeDetails);
	}

	// http://localhost:8080/api/v1/employees
	// delete employee rest api
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		employeeServices.deleteEmployee(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
