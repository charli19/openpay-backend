package com.openpay.app.service.interfaces;

import java.util.List;

import com.openpay.app.data.apimodel.WalletBean;

public interface WalletService {

	List<WalletBean> getWallets();

}
