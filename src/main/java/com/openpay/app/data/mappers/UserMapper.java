package com.openpay.app.data.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.openpay.app.data.apimodel.UserBean;
import com.openpay.app.data.entity.User;

@Mapper(componentModel = "spring", uses = { DocumentTypeMapper.class, WalletMapper.class })
public interface UserMapper {

	UserBean mapToBean(User user);

	List<UserBean> mapToBeanList(List<User> userList);

	User mapToEntity(UserBean userBean);

	List<User> mapToEntityList(List<UserBean> userBeanList);
}
