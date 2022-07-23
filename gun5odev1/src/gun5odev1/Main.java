package gun5odev1;

import java.util.ArrayList;

import gun5odev1.business.abstracts.ISignInService;
import gun5odev1.business.abstracts.ISignUpService;
import gun5odev1.business.concretes.GoogleSignInManager;
import gun5odev1.business.concretes.GoogleSignUpManager;
import gun5odev1.business.concretes.RegularSignInManager;
import gun5odev1.business.concretes.RegularSignUpManager;
import gun5odev1.core.abstracts.IValidationService;
import gun5odev1.core.concretes.EMailValidationAdapter;
import gun5odev1.dataAccess.abstracts.BaseUserDao;
import gun5odev1.dataAccess.concretes.HibernateUserDao;
import gun5odev1.entities.abstracts.BaseUser;
import gun5odev1.entities.concretes.GoogleUser;
import gun5odev1.entities.concretes.RegularUser;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<BaseUser> users = new ArrayList<>();
		BaseUserDao hibernateUserDao = new HibernateUserDao(users);
		
		//Sign up:
		
		BaseUser user = new RegularUser(1, "Ahmet", "Yıldırım", "example@example.com", "123456");
		IValidationService validationService = new EMailValidationAdapter(user.getEmail());
		ISignUpService signUpService = new RegularSignUpManager(hibernateUserDao, validationService);
		signUpService.add(user);
		
		System.out.println("----------");
		
		BaseUser user2 = new RegularUser(2, "Berk", "Demir", "a@aa..com", "123456");
		validationService = new EMailValidationAdapter(user2.getEmail());
		signUpService = new RegularSignUpManager(hibernateUserDao, validationService);
		signUpService.add(user2);
		
		System.out.println("----------");
		
		BaseUser user3 = new RegularUser(3, "A", "B", "ab@example.org", "123456");
		validationService = new EMailValidationAdapter(user3.getEmail());
		signUpService = new RegularSignUpManager(hibernateUserDao, validationService);
		signUpService.add(user3);
		
		System.out.println("----------");
		
		
		BaseUser googleUser = new GoogleUser(4, "example@gmail.com");
		validationService = new EMailValidationAdapter(googleUser.getEmail());
		signUpService = new GoogleSignUpManager(hibernateUserDao, validationService);
		signUpService.add(googleUser);
		
		//Sign in:
		
		System.out.println("----------");
		
		ISignInService signInService = new RegularSignInManager(hibernateUserDao);
		signInService.signIn("example@example.com", "123456");
		signInService.signIn("another@example.com", "123456");
		
		ISignInService googleSignInService = new GoogleSignInManager(hibernateUserDao);
		googleSignInService.signIn("example@gmail.com", null);
		googleSignInService.signIn("another@gmail.com", null);
		
	}

}
