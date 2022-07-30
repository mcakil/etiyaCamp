package entities.concretes;

import entities.abstracts.IEntity;

public class Product implements IEntity{

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
