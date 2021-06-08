package com.openpay.app.data.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class WalletTest {

	@Test
	public void WhenInstantiateWalletThenObjectIsNotNull() {
		Wallet wallet = new Wallet();

		assertNotNull(wallet);
	}

	@Test
	public void WhenSetStringsThenGettersEqualsToSetters() {
		
		Wallet wallet = new Wallet();
		User user = new User();
		
		wallet.setCode("code");
		wallet.setCoins(50L);
		wallet.setDescription("description");
		wallet.setId(1L);
		wallet.setName("name");
		wallet.setUser(user);

		assertEquals("code", wallet.getCode());
		assertEquals(new Long(50), wallet.getCoins());
		assertEquals("description", wallet.getDescription());
		assertEquals(new Long(1), wallet.getId());
		assertEquals("name", wallet.getName());
		assertEquals(user, wallet.getUser());
	}

}
