package com.openpay.app.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openpay.app.data.apimodel.UserBean;
import com.openpay.app.data.apimodel.WalletBean;
import com.openpay.app.data.entity.User;
import com.openpay.app.data.mappers.UserMapper;
import com.openpay.app.repository.UserRepository;
import com.openpay.app.service.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserBean> getUsers() {

		List<User> userList = userRepository.findAll();

		List<UserBean> userBeanList = userMapper.mapToBeanList(userList);

		userBeanList.stream().forEach(x -> x.getWallets().sort(new CustomComparator()));

		return userBeanList;
	}

	@Override
	public UserBean getUser(final Long id) {

		User user = userRepository.getOne(id);

		return userMapper.mapToBean(user);
	}

	private class CustomComparator implements Comparator<WalletBean> {
		@Override
		public int compare(WalletBean o1, WalletBean o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
}
