package com.musicstore.service;

import com.musicstore.model.Cart;
import com.musicstore.model.CartItem;
import org.springframework.stereotype.Service;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void rmoveAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
