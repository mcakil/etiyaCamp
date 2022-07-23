package concrete;

import java.util.List;

import entities.Offer;

public class OfferManager {
	
	private List<Offer> _offers;
	
	public OfferManager(List<Offer> offers) {
		_offers = offers;
	}
	
	public void addOffer(Offer offer) {
		_offers.add(offer);
		System.out.println("Offer added: Game with the id of " + offer.getGameId()
				+ " has its price discounted to:" + offer.getDiscountPrice());
	}
	public void removeOffer(Offer offer) {
		_offers.remove(offer);
		System.out.println("Offer for game with the id of " + offer.getGameId()+ " removed.");
	}
	public void updateOffer(Offer offer) {
		System.out.println("Offer updated.");
	}
	
	public double getOfferPriceIfPresent(int gameId) {
		for(Offer offer : _offers) {
			if (offer.getGameId() == gameId) {
				return offer.getDiscountPrice();
			}
		}
		return -1;
	}

}
