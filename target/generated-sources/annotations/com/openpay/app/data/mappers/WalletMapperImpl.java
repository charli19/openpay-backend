package com.openpay.app.data.mappers;

import com.openpay.app.data.apimodel.DocumentTypeBean;
import com.openpay.app.data.apimodel.UserDetailBean;
import com.openpay.app.data.apimodel.WalletBean;
import com.openpay.app.data.entity.DocumentType;
import com.openpay.app.data.entity.User;
import com.openpay.app.data.entity.Wallet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T23:41:36+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class WalletMapperImpl implements WalletMapper {

    @Override
    public WalletBean mapToBean(Wallet wallet) {
        if ( wallet == null ) {
            return null;
        }

        WalletBean walletBean = new WalletBean();

        walletBean.setId( wallet.getId() );
        walletBean.setName( wallet.getName() );
        walletBean.setDescription( wallet.getDescription() );
        walletBean.setCoins( wallet.getCoins() );
        walletBean.setUser( userToUserDetailBean( wallet.getUser() ) );

        return walletBean;
    }

    @Override
    public List<WalletBean> mapToBeanList(List<Wallet> walletList) {
        if ( walletList == null ) {
            return null;
        }

        List<WalletBean> list = new ArrayList<WalletBean>( walletList.size() );
        for ( Wallet wallet : walletList ) {
            list.add( mapToBean( wallet ) );
        }

        return list;
    }

    @Override
    public Wallet mapToEntity(WalletBean walletBean) {
        if ( walletBean == null ) {
            return null;
        }

        Wallet wallet = new Wallet();

        wallet.setId( walletBean.getId() );
        wallet.setName( walletBean.getName() );
        wallet.setDescription( walletBean.getDescription() );
        wallet.setCoins( walletBean.getCoins() );
        wallet.setUser( userDetailBeanToUser( walletBean.getUser() ) );

        return wallet;
    }

    @Override
    public List<Wallet> mapToEntityList(List<WalletBean> walletBeanList) {
        if ( walletBeanList == null ) {
            return null;
        }

        List<Wallet> list = new ArrayList<Wallet>( walletBeanList.size() );
        for ( WalletBean walletBean : walletBeanList ) {
            list.add( mapToEntity( walletBean ) );
        }

        return list;
    }

    protected DocumentTypeBean documentTypeToDocumentTypeBean(DocumentType documentType) {
        if ( documentType == null ) {
            return null;
        }

        DocumentTypeBean documentTypeBean = new DocumentTypeBean();

        documentTypeBean.setId( documentType.getId() );
        documentTypeBean.setName( documentType.getName() );

        return documentTypeBean;
    }

    protected UserDetailBean userToUserDetailBean(User user) {
        if ( user == null ) {
            return null;
        }

        UserDetailBean userDetailBean = new UserDetailBean();

        userDetailBean.setId( user.getId() );
        userDetailBean.setName( user.getName() );
        userDetailBean.setSurname( user.getSurname() );
        userDetailBean.setDocumentType( documentTypeToDocumentTypeBean( user.getDocumentType() ) );
        userDetailBean.setDocumentNumber( user.getDocumentNumber() );

        return userDetailBean;
    }

    protected DocumentType documentTypeBeanToDocumentType(DocumentTypeBean documentTypeBean) {
        if ( documentTypeBean == null ) {
            return null;
        }

        DocumentType documentType = new DocumentType();

        documentType.setId( documentTypeBean.getId() );
        documentType.setName( documentTypeBean.getName() );

        return documentType;
    }

    protected User userDetailBeanToUser(UserDetailBean userDetailBean) {
        if ( userDetailBean == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDetailBean.getId() );
        user.setName( userDetailBean.getName() );
        user.setSurname( userDetailBean.getSurname() );
        user.setDocumentType( documentTypeBeanToDocumentType( userDetailBean.getDocumentType() ) );
        user.setDocumentNumber( userDetailBean.getDocumentNumber() );

        return user;
    }
}
