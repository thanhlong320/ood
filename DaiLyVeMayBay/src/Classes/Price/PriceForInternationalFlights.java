package Classes.Price;

public class PriceForInternationalFlights implements PriceAfterTax{

	@Override
	public double priceAfterTax(double originalPrice) {
		return originalPrice*0.1 + originalPrice*0.2;
	}
}
