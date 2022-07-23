package gun5odev1.business.concretes;

import gun5odev1.business.abstracts.BaseSignInManager;
import gun5odev1.dataAccess.abstracts.BaseUserDao;

public class GoogleSignInManager extends BaseSignInManager {
	
	public GoogleSignInManager(BaseUserDao userDao) {
		setUserDao(userDao);
	}
	
	@Override
	public void signIn(String email, String password) {
		/*
		 * Google bilgilerinin doğru olup olmadığını kontrol etme şansımız olmadığı
		 * için, sadece bu emailin sistemimizde kayıtlı olup olmadığını kontrol edebiliyoruz.
		 */
		if (getUserDao().isEmailUsed(email)) {
			//Google şifresinin girileceği sayfa açılır, verilen bilgiler doğru ise:
			System.out.println("Google hesabı ( "+email+" ) üzerinden yapılan giriş başarılı!");
		}else {
			System.out.println("Sistemimizde bu email ( "+email+" ) ile Google üzerinden kayıtlı bir kullanıcı bulunmamaktadır.");
		}
	}
}
