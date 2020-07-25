package Classes.City;

public class City {
	String nameCity;
	String cityCode;
	String nation;
	public City(String nameCity, String cityCode, String nation) {
		super();
		this.nameCity = nameCity;
		this.cityCode = cityCode;
		this.nation = nation;
	}
	public String getNameCity() {
		return nameCity;
	}
	public String getCityCode() {
		return cityCode;
	}
	public String getNation() {
		return nation;
	}
	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
}
