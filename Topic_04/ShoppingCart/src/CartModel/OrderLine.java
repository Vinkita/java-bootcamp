package CartModel;

import utils.ProductCatalog;
import utils.Randomizer;

public class OrderLine implements IsumPrices{
	
	Product product;
	int quant;
	
	public OrderLine(Product product, int quant) {
		this.product = product;
		this.quant = quant;
	}

	public OrderLine() {
		product = ProductCatalog.randomProduct();
		quant = Randomizer.getInt(1, 10);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	@Override
	public double getTotal() {
		return product.getPrice() * quant;
	}
	
	
	

}
