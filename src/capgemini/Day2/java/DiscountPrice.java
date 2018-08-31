package capgemini.Day2.java;

public class DiscountPrice {
public static float priceCalculation(float newItemPrice)
{
	float discountAmount;
	int discount=35;
	float finalPrice;
	if(newItemPrice>0) {
	discountAmount=discount*newItemPrice/100;
	finalPrice=newItemPrice-discountAmount;
	return finalPrice;
	}
	else
	{
		return 0;
	}
}
}
