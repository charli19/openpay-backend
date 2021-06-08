package com.openpay.app.data.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.openpay.app.data.apimodel.TransactionBean;
import com.openpay.app.data.entity.Transaction;

@Mapper(componentModel = "spring", uses = { WalletMapper.class })
public interface TransactionMapper {

	TransactionBean mapToBean(Transaction transaction);

	List<TransactionBean> mapToBeanList(List<Transaction> transactionList);

	Transaction mapToEntity(TransactionBean transactionBean);

	List<Transaction> mapToEntityList(List<TransactionBean> transactionBeanList);
}
