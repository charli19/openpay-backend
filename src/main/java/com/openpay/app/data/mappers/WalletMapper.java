package com.openpay.app.data.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.openpay.app.data.apimodel.WalletBean;
import com.openpay.app.data.entity.Wallet;

@Mapper(componentModel = "spring")
public interface WalletMapper {

	WalletBean mapToBean(Wallet wallet);

	List<WalletBean> mapToBeanList(List<Wallet> walletList);

	Wallet mapToEntity(WalletBean walletBean);

	List<Wallet> mapToEntityList(List<WalletBean> walletBeanList);
}
