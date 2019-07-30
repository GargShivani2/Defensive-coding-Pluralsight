package com.company;

public class OrderWin {

    public static void button1_click() {
	// write your code here
        placeOrder();
    }

    private static void placeOrder() {
        Customer customer = new Customer();
        Order order = new Order();
        Payment payment = new Payment();

        boolean allowSplitOrders = true;
        boolean emailReceipt = true;

        OrderController orderController = new OrderController();
        orderController.placeOrder(customer,order,payment,allowSplitOrders,emailReceipt);
    }

}
