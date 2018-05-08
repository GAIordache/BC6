package fin;

public class Address {
	private final String mStreet;
	private final String mCity;
	public Address(String pStreet, String pCity) {
		super();
		mStreet = pStreet;
		mCity = pCity;
	}
	public String getStreet() {
		return mStreet;
	}

	public String getCity() {
		return mCity;
	}
	
	
}
