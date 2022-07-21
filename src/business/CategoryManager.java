package business;

import java.util.ArrayList;
import java.util.List;

import model.Category;

public class CategoryManager {
	public List<Category> categories;

	public CategoryManager() {
		categories = new ArrayList<Category>();
	}
	
	public void add(Category category) {
		categories.add(category);
		System.out.println("Kategori eklendi");
	}
	
	public List<Category> getAll() {
		return categories;
	}
	

}
