package gun5odev1.business.concretes;

import gun5odev1.business.abstracts.BaseSignInManager;
import gun5odev1.dataAccess.abstracts.BaseUserDao;
import gun5odev1.entities.abstracts.BaseUser;

public class RegularSignInManager extends BaseSignInManager{
	
	public RegularSignInManager(BaseUserDao userDao) {
		setUserDao(userDao);
	}
	
	@Override
	public void signIn(String email, String password) {
		BaseUserDao userDao = getUserDao();
		if(!userDao.isEmailUsed(email)) {
			System.out.println(email + " ile sitemizde kayıtlı bir hesap yoktur. Kayıt olmayı deneyin.");
			return;
		}
		
		BaseUser user = userDao.getByEmail(email);
		if (user.getPassword().equals(password)) {
			System.out.println("Şifre doğru, "+ user.getFirstName() +" başarıyla siteye giriş yaptı.");
		}else {
			System.out.println("Şifre veya email doğru değil. Lütfen kontrol ettikten sonra tekrar deneyin.");
		}
	}
}
