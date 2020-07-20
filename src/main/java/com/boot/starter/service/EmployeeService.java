package com.boot.starter.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	void uploadDataFromExcelToDb() throws FileNotFoundException, IOException;
}
