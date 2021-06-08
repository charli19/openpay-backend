package com.openpay.app.data.mappers;

import com.openpay.app.data.apimodel.TransactionBean;
import com.openpay.app.data.entity.Transaction;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T23:41:36+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Autowired
    private WalletMapper walletMapper;

    @Override
    public TransactionBean mapToBean(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionBean transactionBean = new TransactionBean();

        transactionBean.setOriginWallet( walletMapper.mapToBean( transaction.getOriginWallet() ) );
        transactionBean.setDestinyWallet( walletMapper.mapToBean( transaction.getDestinyWallet() ) );
        transactionBean.setCoins( transaction.getCoins() );

        return transactionBean;
    }

    @Override
    public List<TransactionBean> mapToBeanList(List<Transaction> transactionList) {
        if ( transactionList == null ) {
            return null;
        }

        List<TransactionBean> list = new ArrayList<TransactionBean>( transactionList.size() );
        for ( Transaction transaction : transactionList ) {
            list.add( mapToBean( transaction ) );
        }

        return list;
    }

    @Override
    public Transaction mapToEntity(TransactionBean transactionBean) {
        if ( transactionBean == null ) {
            return null;
        }

        Transaction transaction = new Transaction();

        transaction.setOriginWallet( walletMapper.mapToEntity( transactionBean.getOriginWallet() ) );
        transaction.setDestinyWallet( walletMapper.mapToEntity( transactionBean.getDestinyWallet() ) );
        transaction.setCoins( transactionBean.getCoins() );

        return transaction;
    }

    @Override
    public List<Transaction> mapToEntityList(List<TransactionBean> transactionBeanList) {
        if ( transactionBeanList == null ) {
            return null;
        }

        List<Transaction> list = new ArrayList<Transaction>( transactionBeanList.size() );
        for ( TransactionBean transactionBean : transactionBeanList ) {
            list.add( mapToEntity( transactionBean ) );
        }

        return list;
    }
}
