package CartModel;

import java.text.DecimalFormat;

public class Payment {
	String details;
	double total;
	boolean paid;
	
	public Payment(){
		details = "";
		total = 0;
		paid = false;
	}

	public Payment(String details, boolean paid, double total) {
		this.details = details;
		this.paid = paid;
		this.total = total;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("** ");
		builder.append(details + "--");
		builder.append("Paid: "+ paid + "--");
		builder.append("$ ");
		builder.append(new DecimalFormat("#.##").format(total) + "**");
		return builder.toString();
	}
	
}
