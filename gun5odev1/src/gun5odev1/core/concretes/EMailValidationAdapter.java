package gun5odev1.core.concretes;

import gun5odev1.core.abstracts.IValidationService;

public class EMailValidationAdapter implements IValidationService {
	
	String _email;
	
	public EMailValidationAdapter(String email) {
		_email = email;
	}
	
	@Override
	public boolean isValid() {
		System.out.println("Doğrulama linkine tıklandı...");
		return true;
	}

	@Override
	public void sendValidationNotice(String validationCode) {
		System.out.println(_email + " adresine doğrulama kodu gönderildi.");
	}
	
}
