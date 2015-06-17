package CartModel;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart implements IsumPrices {
	private ArrayList<OrderLine> lines;
	private Payment payment;
	private String shipDate;
	private String status;
	private boolean complete;
	
	public ShoppingCart(){
		lines = new ArrayList<OrderLine>();
		payment = new Payment();
		shipDate = "";
		status = "";
		complete = false;
	}
	
	public ShoppingCart(ArrayList<OrderLine> lines, Payment payment,
			String shipDate, String status, boolean complete) {
		this.lines = lines;
		this.payment = payment;
		this.shipDate = shipDate;
		this.status = status;
		this.complete = complete;
	}



	public ArrayList<OrderLine> getOrderLines() {
		return lines;
	}

	public void setOrderLines(ArrayList<OrderLine> lines) {
		this.lines = lines;
	}

	public ArrayList<OrderLine> getLines() {
		return lines;
	}


	public void setLines(ArrayList<OrderLine> lines) {
		this.lines = lines;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	public String getShipDate() {
		return shipDate;
	}


	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public boolean isComplete() {
		return complete;
	}


	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public void addOrder(OrderLine orderLine) {
		lines.add(orderLine);
	}

	@Override
	public double getTotal() {
		double aux = 0;
		for(Iterator<OrderLine> it = lines.iterator(); it.hasNext() ;){
			aux += it.next().getTotal();
		}
		return aux;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("# Shopping Cart:\n");
		
		// Loop on every order line
		for (Iterator<OrderLine> it = lines.iterator(); it.hasNext();){
			OrderLine ol = it.next();
			builder.append("\t"+ol.toString()+"\n");
		}
		
		builder.append("Payment: "+ payment + "|\n");
		builder.append("Shipdate: " + shipDate + "|\n");
		builder.append("Status: " + status + "|\n");
		builder.append("Complete: "+ complete + "|\n");
		return builder.toString();
	}

}
