package business.concretes;

import java.util.List;

import business.abstracts.IEmployeeService;
import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Employee;

public class EmployeeManager implements IEmployeeService {

	IEmployeeDal _employeeDal;
	
	public EmployeeManager(IEmployeeDal employeeDal) {
		_employeeDal = employeeDal;
	}
	
	@Override
	public List<Employee> getAll() {
		return _employeeDal.getAll();
	}

}
