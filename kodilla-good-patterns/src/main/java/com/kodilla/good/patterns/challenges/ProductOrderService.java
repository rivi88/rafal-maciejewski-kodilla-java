package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProduct(), orderRequest.getUser());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getProduct(), orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

    public static void main(String[] args) {


        InformationService informationService = new EmailInformationService();
        OrderService orderService = new AllegroOrderService();
        OrderRepository orderRepository = new DatabaseOrderRepository();


        ProductOrderService productOrderService = new ProductOrderService(informationService, orderService, orderRepository);


        User user = new User("JDoe", "John", "Doe");
        Product product = new Product("Example Product");
        OrderRequest orderRequest = new OrderRequest(user, product);


        OrderDto orderDto = productOrderService.process(orderRequest);


        if (orderDto.isOrdered()) {
            System.out.println("Zamówienie zostało złożone.");
        } else {
            System.out.println("Zamówienie nie zostało złożone.");
        }
    }
}
