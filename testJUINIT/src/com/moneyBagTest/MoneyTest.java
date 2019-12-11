package com.moneyBagTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.moneyBag.Money;

public class MoneyTest {

		@Test
		public void testAmount() {
			Money m = new Money (2,"EUR");
			Assertions.assertEquals(2, m.amount());
		}
		
		@Test
		public void testCurrency() {
			Money m = new Money (2,"EUR");
			Assertions.assertEquals("EUR", m.currency());
		}
		
		@Test
		public void testAddCurrencyDiffMoney() {
			Money m = new Money (2,"EUR");
			Money m1 = new Money (7,"USD");
			m.add(m1);
			Assertions.assertEquals(2, m.amount());
		}
		
		@Test
		public void testAddCurrencySameMoney() {
			Money m = new Money (2,"EUR");
			Money m1 = new Money (7,"EUR");
			m.add(m1);
			Assertions.assertEquals(9, m.amount());
		}
		
		@Test
		public void testMoneyNeg() {
			Money m = new Money (-2,"EUR");
			Money m1 = new Money (7,"EUR");
			m.add(m1);
			Assertions.assertEquals(5, m.amount());
		}
		
		@Test
		public void testAddAmouthAndCurr() {
			Money m = new Money (2,"EUR");
			m.add(7, "EUR");
			Assertions.assertEquals(9, m.amount());
		}
		
		@Test
		public void testMoneyCon() {
			Money m = new Money (2,"EUR");
			Assertions.assertEquals(2, m.amount());
			Assertions.assertEquals("EUR", m.currency());
		}
		
}
