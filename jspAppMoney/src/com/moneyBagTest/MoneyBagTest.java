package com.moneyBagTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.moneyBag.Money;
import com.moneyBag.MoneyBag;


public class MoneyBagTest {

	@Test
	public void testAmount() {
		MoneyBag mB = new MoneyBag();
		Money m = mB.normalisation(new Money (5, "EUR"));
		Assertions.assertEquals(m.currency(), "USD");
		Assertions.assertEquals(m.amount(), 5.545);
	}

}
