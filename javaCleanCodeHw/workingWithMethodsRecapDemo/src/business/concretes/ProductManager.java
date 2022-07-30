package business.concretes;

import java.util.List;

import business.abstracts.IProductService;
import dataAccess.abstracts.IProductDal;
import entities.concretes.Product;

public class ProductManager implements IProductService {

	private IProductDal _productDal;

	public ProductManager(IProductDal productDal) {
		this._productDal = productDal;
	}

	@Override
	public List<Product> getAll() {
		return _productDal.getAll();
	}

}
