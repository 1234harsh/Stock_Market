package com.cognizant.pts.service;

import com.cognizant.pts.model.UserModel;

@Service
public class UserServiceImpl {

	@Autowired
	UserDAO userDao;
	
	
	@Override
	public int doLogin(UserModel userModel) {
		// TODO Auto-generated method stub
		
		User user=new User();
		
		user.setUserId(userModel.getUserId());
		user.setUsername(userModel.getUserame());
		user.setPassword(userModel.getPassword());
		user.setUserType(userModel.getUserType());
		user.setEmail(userModel.getEmail());
		user.setMobileNumber(userModel.getMobileNumber());
		user.setConfirmed(userModel.getConfirmed());
		
		return userDao.doLogin(user);
	}
}
