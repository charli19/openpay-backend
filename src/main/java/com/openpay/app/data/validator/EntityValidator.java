package com.openpay.app.data.validator;

import com.openpay.app.common.exception.MessagesEnum;
import com.openpay.app.common.exception.OpenPayException;
import com.openpay.app.repository.WalletRepository;

public class EntityValidator {

	public static <T> T validateIfExistsAndActive(WalletRepository repository, final String code) {

		@SuppressWarnings("unchecked")
		T entity = (T) repository.findByCodeAndActive(code, true);

		if (entity == null) {
			throw new OpenPayException(MessagesEnum.WALLET_NOT_VALID.getCode());
		}

		return entity;
	}
}
