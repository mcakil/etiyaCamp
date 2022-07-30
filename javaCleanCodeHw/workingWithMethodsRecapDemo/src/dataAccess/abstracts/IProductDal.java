package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Product;

public interface IProductDal {
	List<Product> getAll();
}
