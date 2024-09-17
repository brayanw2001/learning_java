package entities;

public class OrderItem {
    
    private int quantity;
    private double price;

    private Product product;

    OrderItem(){};

    public OrderItem(int quantity, Double price, Product product)
    {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    };

    public int getQuantity() {
        return quantity;
    }

    //public void setQuantity(int quantity) {
    //    this.quantity = quantity;
    //}

    public double getPrice() {
        return price;
    }

    //public void setPrice(double price) {
    //    this.price = price;
    //}
    
    public double subTotal ()
    {
        return quantity*price;
    }

    public Product getProduct() {
        return product;
    }

	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
