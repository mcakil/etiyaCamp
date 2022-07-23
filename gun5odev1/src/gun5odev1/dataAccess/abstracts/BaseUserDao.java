package gun5odev1.dataAccess.abstracts;

import gun5odev1.entities.abstracts.BaseUser;

public interface BaseUserDao {
	void add(BaseUser user);
	BaseUser get(int id);
	BaseUser getByEmail(String email);
	boolean isEmailUsed(String email);
}
