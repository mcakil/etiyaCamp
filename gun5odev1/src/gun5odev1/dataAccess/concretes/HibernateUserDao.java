package gun5odev1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gun5odev1.dataAccess.abstracts.BaseUserDao;
import gun5odev1.entities.abstracts.BaseUser;

public class HibernateUserDao implements BaseUserDao {

	//to make sure we can sign in, we need to store the registered users
	List<BaseUser> _users;
	
	public HibernateUserDao(ArrayList<BaseUser> users) {
		_users = users;
	}

	@Override
	public void add(BaseUser user) {
		_users.add(user);
		System.out.println("Kullanıcı ( "+user.getFirstName()+" ) başarıyla veritabanına kaydedildi.");
	}

	@Override
	public BaseUser get(int id) {
		for(BaseUser user : _users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	@Override
	public boolean isEmailUsed(String email) {
		for(BaseUser user : _users) {
			if (user.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public BaseUser getByEmail(String email) {
		for(BaseUser user : _users) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

}
