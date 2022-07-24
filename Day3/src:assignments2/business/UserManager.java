package business;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserManager {
	List<User> users;
	
	
	public UserManager() {
		users = new ArrayList<>();
	}

	public void add(User user) {
		
		if(!checkIfUserExist(user.getId())){
			users.add(user);
			System.out.println(user.getFirstName() + "User added");
		}else {
			System.out.println("User already exist");
		}
	}
	
	public void delete(User user) {
		if(checkIfUserExist(user.getId())){
			users.remove(user);
			System.out.println(user.getFirstName() + "User deleted");
		} else
		System.out.println("User is not found");
		
	}
	
	public List<User> getAll() {
		return users;
	}
	
	private boolean checkIfUserExist(int id) {
		boolean exists = false;
		for(User user : users) {
			if(user.getId() == id) {
				exists = true;
			}
		}
		return exists;
	}
}
