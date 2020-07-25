package Classes.Price;

public class PriceForDomesticFlights implements PriceAfterTax{

	@Override
	public double priceAfterTax(double originalPrice) {
		return originalPrice*0.5;
	}

}
