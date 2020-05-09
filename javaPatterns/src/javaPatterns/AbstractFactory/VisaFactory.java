package javaPatterns.AbstractFactory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD: 
			return new VisaGoldCreditCard();
		case PLATINUM:
			return new VisaPlatinumCrediCard();
		default:
			throw new IllegalArgumentException("Unexpected value: " + cardType);
		}
	}

}
