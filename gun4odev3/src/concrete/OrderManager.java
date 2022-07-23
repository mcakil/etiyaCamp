package concrete;


import entities.Customer;
import entities.Game;

public class OrderManager{
	
	private Customer _customer;
	private OfferManager _offerManager;
	
	public OrderManager(Customer customer, OfferManager offerManager) {
		_customer = customer;
		_offerManager = offerManager;
	}
	
	public void purchase(Game game) {
		double offerPrice = _offerManager.getOfferPriceIfPresent(game.getId());
		if (offerPrice != -1) {
			System.out.println(_customer.getUsername() + " has purchased " + game.getName() + " with a discounted price of " + offerPrice);
		}else {
			System.out.println(_customer.getUsername() + " has purchased " + game.getName() + " without a discount.");
		}
		
	}
	
}
