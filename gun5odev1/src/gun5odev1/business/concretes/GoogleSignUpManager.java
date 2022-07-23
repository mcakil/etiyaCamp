package gun5odev1.business.concretes;

import gun5odev1.business.abstracts.BaseSignUpManager;
import gun5odev1.core.abstracts.IValidationService;
import gun5odev1.dataAccess.abstracts.BaseUserDao;
import gun5odev1.entities.abstracts.BaseUser;

public class GoogleSignUpManager extends BaseSignUpManager {

	public GoogleSignUpManager(BaseUserDao userDao, IValidationService validationService) {
		setUserDao(userDao);
		setValidationService(validationService);
	}
	
	@Override
	public void add(BaseUser user) {
		if(getUserDao().isEmailUsed(user.getEmail())) {
			System.out.println("Verilen email ("+ user.getEmail() + ") ile sitemizde kayıtlı başka bir üye mevcuttur.");
			return;
		}
		
		// google üzerinden veri doğruluğu kontrolü kodu burada olmalı
		
		/* google hesabı ile giriş yaptığımızda, google şifremizi kullandığımız için
		 * kullanıcının bizim sitemizde kullanması için herhangi bir şifreye
		 * ihtiyacı yoktur. aşağıdaki şifre, google hesabı teyit edildikten sonra
		 * google tarafından bize gönderilen ve arkaplanda kullanılan bir şifredir.
		 */
		
		String firstNameSentByGoogle = "Elif";
		String lastNameSentByGoogle = "Demir";
		String passwordSentByGoogle = "123456";
		
		user.setFirstName(firstNameSentByGoogle);
		user.setLastName(lastNameSentByGoogle);
		user.setPassword(passwordSentByGoogle);
		
		// doğrulama kodu:
		
		getValidationService().sendValidationNotice("123456789");
		if(!getValidationService().isValid()) {
			System.out.println("Doğrulama metodunu tamamlayamadığınız için kayıdınız başarısız oldu.");
			return;
		}else {
			System.out.println("Doğrulama metodu başarı ile tamamlandı.");
		}
		
		System.out.println(user.getFirstName() + " sitemize bir Google hesabı ile kaydoldu.");
		getUserDao().add(user);
	}

}
