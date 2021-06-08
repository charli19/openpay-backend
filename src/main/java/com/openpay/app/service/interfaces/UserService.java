package com.openpay.app.service.interfaces;

import java.util.List;

import com.openpay.app.data.apimodel.UserBean;

public interface UserService {

	List<UserBean> getUsers();

	UserBean getUser(Long id);

}
