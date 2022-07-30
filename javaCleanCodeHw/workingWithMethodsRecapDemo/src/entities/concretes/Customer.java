package entities.concretes;

public class Customer extends Person {
	/*Unlike C#, Java does not have built-in properties, so we have to add getter
	 * and setter methods ourselves. */
	private int cityId;

	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}
