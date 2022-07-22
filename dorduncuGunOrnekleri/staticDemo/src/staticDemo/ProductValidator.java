package staticDemo;

public class ProductValidator {
	
	//sınıf instantiate edilmese bile çalışır
	static {
		System.out.println("Static yapıcı blok çalıştı.");
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void validate() {
		System.out.println("Ürün onaylandı.");
	}
	
	//NOT: Java'da sadece inner classlar static olabilir.
	public static class OtherClass {
		public static void Sil() {
			
		}
	}
}
