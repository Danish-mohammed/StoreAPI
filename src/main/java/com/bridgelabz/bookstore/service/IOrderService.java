package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.OrderDto;
import com.bridgelabz.bookstore.model.OrderData;

import java.util.List;

public interface IOrderService {

    OrderData placeOrder( int userId,OrderDto orderDto);

    String cancelOrder(int orderId,int userId);

    List<OrderData> userOrders(int userId);

    List<OrderData> allOrders();
}
