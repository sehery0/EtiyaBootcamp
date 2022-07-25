import java.util.List;

public class UnionCustomer extends Customer {
	private String name;

	public UnionCustomer() {
		super();
	}

	public UnionCustomer(int id,String customerNumber, String name, Canal canal) {
		super(id, customerNumber, canal );
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
