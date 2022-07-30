package dataAccess.concretes.entityFramework;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Employee;

public class EfEmployeeDal implements IEmployeeDal {

	@Override
	public List<Employee> getAll() {
		Employee employee1 = new Employee();
		employee1.setFirstName("Employee1FirstName");
		Employee employee2 = new Employee();
		employee2.setFirstName("Employee2FirstName");
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		
		return list;
	}

}
