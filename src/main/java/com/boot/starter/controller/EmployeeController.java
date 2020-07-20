package com.boot.starter.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.starter.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path="excel")
	public String insertDataFromExcel() throws FileNotFoundException, IOException{
		
		employeeService.uploadDataFromExcelToDb();
		return "CSV Uploaded To DB";
	}
		
	}
	
