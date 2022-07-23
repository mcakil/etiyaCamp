package gun5odev1.business.abstracts;

import gun5odev1.dataAccess.abstracts.BaseUserDao;

public class BaseSignInManager implements ISignInService {
	
	private BaseUserDao _userDao;

	@Override
	public void signIn(String email, String password) {
		
	}

	public BaseUserDao getUserDao() {
		return _userDao;
	}

	public void setUserDao(BaseUserDao _userDao) {
		this._userDao = _userDao;
	}

}
