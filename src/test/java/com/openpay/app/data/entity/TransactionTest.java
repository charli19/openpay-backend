package com.openpay.app.data.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TransactionTest {

	@Test
	public void WhenInstantiateTransactionThenObjectIsNotNull() {

		Transaction transaction = new Transaction();

		assertNotNull(transaction);
	}

	@Test
	public void WhenSetStringsThenGettersEqualsToSetters() {

		Transaction transaction = new Transaction();
		Wallet originWallet = new Wallet();
		Wallet destinyWallet = new Wallet();

		transaction.setCoins(50L);
		transaction.setOriginWallet(originWallet);
		transaction.setDestinyWallet(destinyWallet);

		
		assertEquals(new Long(50), transaction.getCoins());
		assertEquals(originWallet, transaction.getOriginWallet());
		assertEquals(destinyWallet, transaction.getDestinyWallet());
	}

}
