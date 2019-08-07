package com.cognizant.pts.dao;

import java.util.List;

import javax.websocket.Session;

import com.cognizant.pts.entity.User;

@Repository("UserDAOImpl")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
		@Override
		public int doLogin(User user) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from User o where o.userId=:userId");
			query.setString("userId", user.getUserId());
			Query query1=session.createQuery("from User o where password=:password");
			query1.setString("Password", user.getPassword());
			
			List<User> userIdList=query.list();
			List<User> PasswordList=query1.list();
			if(userIdList.isEmpty())
			{
				return 1;
		    }
			else if(PasswordList.isEmpty())
			{
				return 2;
			}
			else 
			{
				return 3;
			}
		}
}
