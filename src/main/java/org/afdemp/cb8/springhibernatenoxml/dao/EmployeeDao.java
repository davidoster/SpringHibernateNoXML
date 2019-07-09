package org.afdemp.cb8.springhibernatenoxml.dao;

import java.util.List;
import org.afdemp.cb8.springhibernatenoxml.models.Employee;


public interface EmployeeDao {

	Employee findById(int id);

	void saveEmployee(Employee employee);
	
	void deleteEmployeeBySsn(String ssn);
	
	List<Employee> findAllEmployees();

	Employee findEmployeeBySsn(String ssn);

}
