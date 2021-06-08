package com.openpay.app.data.mappers;

import com.openpay.app.data.apimodel.UserBean;
import com.openpay.app.data.entity.User;
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
public class UserMapperImpl implements UserMapper {

    @Autowired
    private DocumentTypeMapper documentTypeMapper;
    @Autowired
    private WalletMapper walletMapper;

    @Override
    public UserBean mapToBean(User user) {
        if ( user == null ) {
            return null;
        }

        UserBean userBean = new UserBean();

        userBean.setId( user.getId() );
        userBean.setName( user.getName() );
        userBean.setSurname( user.getSurname() );
        userBean.setDocumentType( documentTypeMapper.mapToBean( user.getDocumentType() ) );
        userBean.setDocumentNumber( user.getDocumentNumber() );
        userBean.setWallets( walletMapper.mapToBeanList( user.getWallets() ) );

        return userBean;
    }

    @Override
    public List<UserBean> mapToBeanList(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserBean> list = new ArrayList<UserBean>( userList.size() );
        for ( User user : userList ) {
            list.add( mapToBean( user ) );
        }

        return list;
    }

    @Override
    public User mapToEntity(UserBean userBean) {
        if ( userBean == null ) {
            return null;
        }

        User user = new User();

        user.setId( userBean.getId() );
        user.setName( userBean.getName() );
        user.setSurname( userBean.getSurname() );
        user.setDocumentType( documentTypeMapper.mapToEntity( userBean.getDocumentType() ) );
        user.setDocumentNumber( userBean.getDocumentNumber() );
        user.setWallets( walletMapper.mapToEntityList( userBean.getWallets() ) );

        return user;
    }

    @Override
    public List<User> mapToEntityList(List<UserBean> userBeanList) {
        if ( userBeanList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userBeanList.size() );
        for ( UserBean userBean : userBeanList ) {
            list.add( mapToEntity( userBean ) );
        }

        return list;
    }
}
