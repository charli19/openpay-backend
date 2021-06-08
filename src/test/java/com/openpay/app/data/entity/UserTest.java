package com.openpay.app.data.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UserTest {

	@Test
	public void WhenInstantiateUserThenObjectIsNotNull() {
		User user = new User();

		assertNotNull(user);
	}

	@Test
	public void WhenSetStringsThenGettersEqualsToSetters() {
		User user = new User();
		DocumentType documentType = new DocumentType();
		Wallet wallet = new Wallet();
		List<Wallet> wallets = new ArrayList<Wallet>();

		wallets.add(wallet);

		user.setId(1L);
		user.setName("name");
		user.setSurname("surname");
		user.setDocumentType(documentType);
		user.setDocumentNumber("documentNumber");
		user.setWallets(wallets);

		assertEquals(new Long(1), user.getId());
		assertEquals("name", user.getName());
		assertEquals("surname", user.getSurname());
		assertEquals(documentType, user.getDocumentType());
		assertEquals("documentNumber", user.getDocumentNumber());
		assertEquals(wallets, user.getWallets());
	}

}
