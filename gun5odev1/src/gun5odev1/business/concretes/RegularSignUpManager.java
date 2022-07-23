package gun5odev1.business.concretes;

import gun5odev1.business.abstracts.BaseSignUpManager;
import gun5odev1.core.abstracts.IValidationService;
import gun5odev1.dataAccess.abstracts.BaseUserDao;
import gun5odev1.entities.abstracts.BaseUser;

public class RegularSignUpManager extends BaseSignUpManager {

	public RegularSignUpManager(BaseUserDao userDao, IValidationService validationService) {
		setUserDao(userDao);
		setValidationService(validationService);
	}
	
	@Override
	public void add(BaseUser user) {
		
		if (user.getPassword().length() < 6) {
			System.out.println("Şifre 6 karakterden uzun olmalıdır.");
			return;
		}
		
		if (!user.getEmail().matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {
			System.out.println("Verilen email geçersizdir.");
			return;
		}
		
		if(getUserDao().isEmailUsed(user.getEmail())) {
			System.out.println("Bu email ile kayıtlı bir hesap sitemizde bulunmaktadır.");
			return;
		}
		
		if (user.getFirstName().length() < 2) {
			System.out.println("İsim en az 2 karakter uzunluğunda olmalıdır.");
			return;
		}
		
		if (user.getLastName().length() < 2) {
			System.out.println("Soyisim en az 2 karakter uzunluğunda olmalıdır.");
			return;
		}
		
		getValidationService().sendValidationNotice("123456789");
		if(!getValidationService().isValid()) {
			System.out.println("Doğrulama metodunu tamamlayamadığınız için kayıdınız başarısız oldu.");
			return;
		}else {
			System.out.println("Doğrulama metodu başarı ile tamamlandı.");
		}
		
		System.out.println(user.getFirstName() + " başarıyla sitemize kaydoldu.");
		getUserDao().add(user);
	}
}
