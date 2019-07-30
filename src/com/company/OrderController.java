package com.company;

public class OrderController {
    private CustomerRepository customerRepo;
    private OrderRepository orderRepo;
    private InventoryRepository inventoryRepo;

    public CustomerRepository getCustomerRepo() {
        return customerRepo;
    }
    public void setCustomerRepo(CustomerRepository custRepo)
    {
        this.customerRepo = custRepo;
    }

    public InventoryRepository getInventoryRepo() {
        return inventoryRepo;
    }

    public void setInventoryRepo(InventoryRepository inventoryRepo) {
        this.inventoryRepo = inventoryRepo;
    }

    public void setOrderRepo(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }
    public OrderRepository getOrderRepo() {
        return orderRepo;
    }

    public void placeOrder(Customer customer, Order order,
                           Payment payment,
                           boolean allowSplitOrders,
                           boolean emailReceipt){
        //CustomerRepo customerRepo = new CustomerRepo();
        customerRepo.add(customer);

        //OrderRepo orderRepo = new OrderRepo();
        orderRepo.add(order);

        //InventoryRepo inventoryRepo = new InventoryRepo();
        inventoryRepo.orderItems(order,allowSplitOrders);

        payment.processPayment(payment);

        if(emailReceipt)
        {
            customer.validateEmail();
            customerRepo.update();
            EmailLibrary emailLibrary = new EmailLibrary();
            emailLibrary.sendEmail(customer.emailAddress);
        }




    }


}
