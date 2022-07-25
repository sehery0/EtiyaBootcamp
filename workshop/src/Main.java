import business.concretes.EmailNotification;
import business.concretes.SmsNotification;
import business.concretes.UserManager;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Seher", "Yalçın", "abc@gmail.com", "12345");
		UserManager userManager1 = new UserManager(new EmailNotification());
		UserManager userManager2 = new UserManager(new SmsNotification());
		userManager2.register(user);
		userManager1.forgotPassword(user);
		
	}

}
