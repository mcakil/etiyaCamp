package gun5odev1.business.abstracts;

import gun5odev1.core.abstracts.IValidationService;
import gun5odev1.dataAccess.abstracts.BaseUserDao;
import gun5odev1.entities.abstracts.BaseUser;

public class BaseSignUpManager implements ISignUpService {
	
	private BaseUserDao _userDao;
	private IValidationService validationService;
	
	@Override
	public void add(BaseUser user) {
		
	}

	public BaseUserDao getUserDao() {
		return _userDao;
	}

	public void setUserDao(BaseUserDao _userDao) {
		this._userDao = _userDao;
	}

	public IValidationService getValidationService() {
		return validationService;
	}

	public void setValidationService(IValidationService validationService) {
		this.validationService = validationService;
	}

}
