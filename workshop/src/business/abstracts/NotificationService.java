package business.abstracts;

import entities.concretes.User;

public interface NotificationService {
	void sendNotification(User user);

}
