package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CartServiceDto;
import com.bridgelabz.bookstore.model.CartData;

import java.util.List;

public interface ICartService {

    CartData addToCart(CartServiceDto cartDTO);

    void deleteFromCart(int cartId);
    void deleteAll();

    CartData updateQuantity(int cartId, int quantity,long totalPrice);

    List<CartData> findAllInCart(int userId);
}
