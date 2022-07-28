import java.time.LocalDate;

import kosgebWorkshop.entities.Application;
import kosgebWorkshop.entities.ApplicationStatus;
import kosgebWorkshop.entities.Bank;
import kosgebWorkshop.entities.BankUser;
import kosgebWorkshop.entities.BlackList;
import kosgebWorkshop.entities.Corporate;
import kosgebWorkshop.entities.Credit;
import kosgebWorkshop.entities.CreditProperty;
import kosgebWorkshop.entities.Entrepreneur;
import kosgebWorkshop.entities.Personnel;
import kosgebWorkshop.entities.Property;
import kosgebWorkshop.entities.Role;
import kosgebWorkshop.entities.UserRole;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank(1, "VakıfBank");
		
		BankUser bankUser = new BankUser(1, "Banka Çalışanı", "123456", bank);
		bank.getBankUsers().add(bankUser);
		
		Personnel personnel = new Personnel(1, "testPerson", "123", "Adam", 1, "10000");
		
		Role role = new Role(1, "Görüntüleyebilir");
		UserRole userRole = new UserRole(1, role, personnel);
		
		Entrepreneur entrepreneur = new Entrepreneur(1, "test", "123", "Jane", "Brown");
		Corporate corporate = new Corporate(2, "KOBİ", "123456", "Bir KOBİ");
		
		BlackList blacklist = new BlackList();
		blacklist.getUsers().add(entrepreneur);
		
		Credit credit = new Credit(1, "Erzurum Kredisi", LocalDate.of(2022, 7, 1));
		
		Property property1 = new Property(1, "Destek Oranı", "1000");
		Property property2 = new Property(2, "Üst Limit", "5000");
		Property property3 = new Property(3, "Alt Limit", "4000");
		Property property4 = new Property(4, "Kredi Hacmi", "200");
		Property property5 = new Property(5, "Yedek Hacmi", "50");
		Property property6 = new Property(6, "İl", "Erzurum");
		Property property7 = new Property(7, "Sektör", "Tarım");
		
		CreditProperty creditProperty1 = new CreditProperty(1, credit, property1);
		CreditProperty creditProperty2 = new CreditProperty(1, credit, property2);
		CreditProperty creditProperty3 = new CreditProperty(1, credit, property3);
		CreditProperty creditProperty4 = new CreditProperty(1, credit, property4);
		CreditProperty creditProperty5 = new CreditProperty(1, credit, property5);
		CreditProperty creditProperty6 = new CreditProperty(1, credit, property6);
		CreditProperty creditProperty7 = new CreditProperty(1, credit, property7);
		
		credit.getCreditProperties().add(creditProperty1);
		credit.getCreditProperties().add(creditProperty2);
		credit.getCreditProperties().add(creditProperty3);
		credit.getCreditProperties().add(creditProperty4);
		credit.getCreditProperties().add(creditProperty5);
		credit.getCreditProperties().add(creditProperty6);
		credit.getCreditProperties().add(creditProperty7);
		
		
		ApplicationStatus applicationStatus1 = new ApplicationStatus(1, "Asil başvurunuz onay bekliyor.");
		ApplicationStatus applicationStatus2 = new ApplicationStatus(2, "Yedek başvurunuz onay bekliyor.");
		ApplicationStatus applicationStatus3 = new ApplicationStatus(3, "Başvurunuz onaylandı.");
		ApplicationStatus applicationStatus4 = new ApplicationStatus(4, "Başvurunuz reddedildi.");
		
		Application application = new Application(1, corporate, credit, applicationStatus1);
		
		System.out.println("Başvuru: " + application.getId());
		System.out.println("\t Başvuru Sahibi'nin kullanıcı ismi: " + application.getApplicant().getUsername());
		System.out.println("\t Başvurulan kredi ismi: " + application.getCredit().getName());
		System.out.println("\t Başvurulan kredinin özellikleri:");
		for(CreditProperty creditProperty : application.getCredit().getCreditProperties()) {
			System.out.println("\t\t"+creditProperty.getProperty().getName()+" : "+creditProperty.getProperty().getValue());
		}
		System.out.println("\t Başvuru durumu: " + application.getStatus().getStatusName());
		
		
	}

}
