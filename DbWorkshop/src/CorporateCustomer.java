import java.util.List;

public class CorporateCustomer extends Customer {
	String title;
	String taxNo;
	public CorporateCustomer() {
		super();
	}
	public CorporateCustomer(int id, String customerNumber, String title, String taxNo, Canal canal) {
		super(id, customerNumber, canal);
		this.title = title;
		this.taxNo = taxNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTaxNo() {
		return taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	
	

}
