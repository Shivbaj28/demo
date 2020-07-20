package com.boot.starter.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boot.starter.entity.Employee;
import com.boot.starter.repository.EmployeeRepo;
import com.boot.starter.service.EmployeeService;

import au.com.bytecode.opencsv.CSVReader;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private Employee employee;


	String line = "";
	/*
	 * @Override public void uploadDataFromExcelToDb() {
	 * 
	 * try {
	 * 
	 * CSVReader reader = new CSVReader(new FileReader("src/main/resources/o.csv"),
	 * ',');
	 * 
	 * String[] nextLine;
	 * 
	 * while ((nextLine = reader.readNext()) != null) { //for (String data :
	 * nextLine) {
	 * 
	 * 
	 * employee.setName(nextLine[0]); employee.setPhone(nextLine[1]);
	 * employee.setCity(nextLine[2]); employee.setTechnology(nextLine[3]);
	 * employeeRepo.save(employee);
	 * 
	 * 
	 * //} employeeRepo.save(employee);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * }
	 * 
	 * catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * }
	 */
	
	
	
	
	

	@Override
	public void uploadDataFromExcelToDb() {

		try {

		BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/o.csv"));

			

			while ((line = reader.readLine()) != null) {
				//for (String data : nextLine) {
				String [] data=line.split(",");


					employee.setName(data[0]);
					employee.setPhone(data[1]);
					employee.setCity(data[2]);
					employee.setTechnology(data[3]);
					employeeRepo.save(employee);


				//}
					employeeRepo.save(employee);
					

			
			
				

			}

		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}

}
