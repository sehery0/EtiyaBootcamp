package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.NotificationService;
import business.abstracts.UserService;
import entities.concretes.User;

public class UserManager implements UserService {
	
	List<User> users = new ArrayList<>();
	NotificationService notificationService;


	public UserManager(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@Override
	public void register(User user) {
		users.add(user);
		notificationService.sendNotification(user);
		System.out.println("Kullanıcı kaydedildi");
		
	}

	@Override
	public void forgotPassword(User user) {
		notificationService.sendNotification(user);
		System.out.println("Yeni parola gönderildi");
		
	}

}
