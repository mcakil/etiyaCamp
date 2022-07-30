package dataAccess.concretes.entityFramework;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.IProductDal;
import entities.concretes.Product;

public class EfProductDal implements IProductDal {

	@Override
	public List<Product> getAll() {
		
		ArrayList<Product> list = new ArrayList<>();
		Product product1 = new Product();
		product1.setName("Pencil");
		Product product2 = new Product();
		product2.setName("Eraser");
		
		list.add(product1);
		list.add(product2);
		
		return list;
	}

}
