package c;
import java.io.Serializable;
public class address implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String addressLocation;
	private String city;
	private String country;

	public String getAddressLocation() {
		return addressLocation;
	}

	public void setAddressLocation(String addressLocation) {
		this.addressLocation = addressLocation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public address(String addressLocation, String city, String country) {
		this.addressLocation = addressLocation;
		this.city = city;
		this.country = country;
	}

	public address() {}

	@Override
	public String toString() {
		return "Address [addressLocation=" + addressLocation + 
				", city=" + city + ", country=" + country + "]";
	}

	
}

