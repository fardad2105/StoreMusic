package com.musicstore.dao;

import com.musicstore.model.Cart;
import com.musicstore.model.CartItem;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
