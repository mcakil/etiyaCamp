package kodlamaioDbWorkshop.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDbWorkshop.entities.concretes.Address;

public class AddressManager{
	List<Address> addresses;
	
	public AddressManager() {
		addresses = new ArrayList<>();
	}
	
	public void add(Address address) {
		addresses.add(address);
		System.out.println("Adres eklendi= ID: " + address.getId() + " / CustomerID: " + address.getCustomer().getId() + " / AddressDetails: " + address.getAddressDetails() );
	}
	
	public List<Address> getAll() {
		return addresses;
	}
}
