package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		// NOT: static metodlar class ismi ile çağrılabilirken statik olmayan metodlar çağrılamaz
		if(ProductValidator.isValid(product)){
			System.out.println("Eklendi.");
		}else {
			System.out.println("Ürün bilgilieri geçersizdir.");
		}
		
		ProductValidator validator = new ProductValidator();
		validator.validate();
	}
}
