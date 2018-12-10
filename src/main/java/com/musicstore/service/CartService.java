package com.musicstore.service;

import com.musicstore.model.Cart;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
