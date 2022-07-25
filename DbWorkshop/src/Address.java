
public class Address {
	private int id;
	private String cityName;
	private String countryName;
	private String district;
	private String addressDetails;
	private Customer customer;
	
	public Address() {
		super();
	}

	public Address(int id, String cityName, String countryName, String district, String addressDetails,
			Customer customer) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.countryName = countryName;
		this.district = district;
		this.addressDetails = addressDetails;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
