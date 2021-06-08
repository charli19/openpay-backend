package com.openpay.app.service;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openpay.app.common.exception.MessagesEnum;
import com.openpay.app.common.exception.OpenPayException;
import com.openpay.app.data.apimodel.TransactionCreateBean;
import com.openpay.app.data.entity.Transaction;
import com.openpay.app.data.entity.Wallet;
import com.openpay.app.data.validator.EntityValidator;
import com.openpay.app.repository.TransactionRepository;
import com.openpay.app.repository.WalletRepository;
import com.openpay.app.service.interfaces.TransactionService;

@Transactional
@Service
public class TransactionServiceImpl implements TransactionService {

	private static final String ADMIN = "Admin";

	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	private WalletRepository walletRepository;

	@Override
	public boolean createTransaction(TransactionCreateBean TransactionCreateBean) {

		Wallet originWallet = EntityValidator.validateIfExistsAndActive(walletRepository,
				TransactionCreateBean.getOriginWallet().toString());

		Wallet destinyWallet = EntityValidator.validateIfExistsAndActive(walletRepository,
				TransactionCreateBean.getDestinyWallet().toString());

		validateTransaction(TransactionCreateBean, originWallet, destinyWallet);

		Transaction transaction = new Transaction();

		mapTransaction(transaction, TransactionCreateBean, originWallet, destinyWallet);

		transactionRepository.save(transaction);

		return true;
	}

	private void validateTransaction(TransactionCreateBean TransactionCreateBean, Wallet originWallet,
			Wallet destinyWallet) {

		validateUsers(originWallet, destinyWallet);

		updateWallets(TransactionCreateBean, originWallet, destinyWallet);
	}

	private void validateUsers(Wallet originWallet, Wallet destinyWallet) {

		validateNif(originWallet.getUser().getDocumentNumber());
		validateNif(destinyWallet.getUser().getDocumentNumber());
	}

	private void updateWallets(TransactionCreateBean TransactionCreateBean, Wallet originWallet, Wallet destinyWallet) {

		if (originWallet.getCoins() < TransactionCreateBean.getCoins()) {
			throw new OpenPayException(MessagesEnum.COINS_NOT_VALID.getCode());
		}

		originWallet.setCoins(originWallet.getCoins() - TransactionCreateBean.getCoins());
		destinyWallet.setCoins(destinyWallet.getCoins() + TransactionCreateBean.getCoins());

		walletRepository.save(originWallet);
		walletRepository.save(destinyWallet);
	}

	private static void validateNif(String nif) {
		Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
		Matcher matcher = pattern.matcher(nif);

		if (matcher.matches()) {
			final String letra = matcher.group(2);
			final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
			int index = Integer.parseInt(matcher.group(1));
			index = index % 23;
			final String reference = letras.substring(index, index + 1);

			if (!reference.equalsIgnoreCase(letra)) {
				throw new OpenPayException(MessagesEnum.NIF_NOT_VALID.getCode());
			}

		} else {
			throw new OpenPayException(MessagesEnum.NIF_NOT_VALID.getCode());
		}
	}

	private void mapTransaction(Transaction transaction, TransactionCreateBean TransactionCreateBean,
			Wallet originWallet, Wallet destinyWallet) {

		transaction.setCoins(TransactionCreateBean.getCoins());
		transaction.setOriginWallet(originWallet);
		transaction.setDestinyWallet(destinyWallet);
		transaction.setCreatedDate(new Date());
		transaction.setCreatedBy(ADMIN);
		transaction.setLastModifiedDate(new Date());
		transaction.setLastModifiedBy(ADMIN);

	}

}
