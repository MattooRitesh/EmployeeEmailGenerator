package com.ritesh.service;

import com.ritesh.model.Employee;

public interface EmployeeService {
String generateEmailID(String fname, String lname,String deptName);
String generatePassword();
void showEmployeeEDetails(Employee e);

}
