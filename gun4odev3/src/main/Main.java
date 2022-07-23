package main;

import java.util.ArrayList;
import java.util.Calendar;

import adapters.MernisServiceAdapter;
import concrete.CustomerManager;
import concrete.OfferManager;
import concrete.OrderManager;
import entities.Customer;
import entities.Game;
import entities.Offer;

public class Main {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setUserId(1);
		customer.setUsername("A_Gamer");
		customer.setFirstName("Jane");
		customer.setLastName("Doe");
		customer.setNationalityId("00000000000");
		
		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.clear();
		dateOfBirth.set(1990, 1, 1);
		
		customer.setDateOfBirth(dateOfBirth);
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.addCustomer(customer);
		
		Game game = new Game();
		game.setId(1);
		game.setName("Worms");
		game.setPrice(30);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setName("F1 2005");
		game2.setPrice(60);
		
		Offer offer = new Offer();
		offer.setGameId(1);
		offer.setDiscountPrice(15);
		
		OfferManager offerManager = new OfferManager(new ArrayList<Offer>());
		offerManager.addOffer(offer);
		
		OrderManager orderManager = new OrderManager(customer, offerManager);
		orderManager.purchase(game);
		orderManager.purchase(game2);
		
	}
}
