package com.openpay.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openpay.app.data.apimodel.WalletBean;
import com.openpay.app.data.entity.Wallet;
import com.openpay.app.data.mappers.WalletMapper;
import com.openpay.app.repository.WalletRepository;
import com.openpay.app.service.interfaces.WalletService;

@Service
public class WalletServiceImpl implements WalletService {

	@Autowired
	private WalletRepository walletRepository;

	@Autowired
	private WalletMapper walletMapper;

	@Override
	public List<WalletBean> getWallets() {

		List<Wallet> walletList = walletRepository.findAll();
		
		return walletMapper.mapToBeanList(walletList);
	}

}
