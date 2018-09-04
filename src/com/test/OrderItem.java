package com.test;

public class OrderItem {

	private int id;
    private Order order;
    private Product product;
    private int number;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
}
