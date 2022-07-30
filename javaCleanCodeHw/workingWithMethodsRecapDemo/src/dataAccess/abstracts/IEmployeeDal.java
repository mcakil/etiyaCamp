package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Employee;

public interface IEmployeeDal {
	List<Employee> getAll();
	
}
