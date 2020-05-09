package javaPatterns.AbstractFactory;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {

		switch (cardType) {
		case GOLD: 
			return new AmexGoldCreditCard();
		case PLATINUM:
			return new AmexPlatinumCrediCard();
		default:
			throw new IllegalArgumentException("Unexpected value: " + cardType);
		}
		
	}

}
