package gun5odev1.core.abstracts;

public interface IValidationService {
	boolean isValid();
	void sendValidationNotice(String validationCode);
}
