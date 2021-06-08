package com.openpay.app.service.interfaces;

import com.openpay.app.data.apimodel.TransactionCreateBean;

public interface TransactionService {

	boolean createTransaction(TransactionCreateBean transactionBean);

}
