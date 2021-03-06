package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CartServiceDto;
import com.bridgelabz.bookstore.model.BookDetails;
import com.bridgelabz.bookstore.model.CartData;
import com.bridgelabz.bookstore.model.UserRegistrationData;
import com.bridgelabz.bookstore.repository.CartRepository;
import com.bridgelabz.bookstore.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService implements ICartService {

    @Autowired
    IUserRegistrationService userService;

    @Autowired
    BookDetailsService bookService;

    @Autowired
    CartRepository cartRepo;

    @Autowired
    UserRegistrationRepository userRepo;

    @Override
    public CartData addToCart(CartServiceDto cartDTO) {
        Optional<UserRegistrationData> user = Optional.ofNullable(userService.getUserById(cartDTO.userId));
        if (user.isPresent()) {
            BookDetails book = bookService.getBookById(cartDTO.bookId);
            CartData cart = new CartData(user.get(), book, cartDTO.quantity,cartDTO.totalPrice);
            return cartRepo.save(cart);
        }
        return null;
    }

    @Override
    public void deleteFromCart(int cartId) {
        cartRepo.deleteById(cartId);
    }

    @Override
    public void deleteAll() {
        cartRepo.deleteAll();
    }

    @Override
    public CartData updateQuantity(int cartId, int quantity,long totalPrice) {
        CartData cart = cartRepo.getById(cartId);
        System.out.println(totalPrice);
        cart.setQuantity(quantity);
        cart.setTotalPrice(totalPrice);
        return cartRepo.save(cart);
    }

    @Override
    public List<CartData> findAllInCart(int userId) {
        List<CartData> cartItems = cartRepo.findAllCartsByUserId(userId);
        System.out.println(cartItems);
        return cartItems;
    }
}
