package com.musicstore.service.impl;

import com.musicstore.dao.CartItemDao;
import com.musicstore.model.Cart;
import com.musicstore.model.CartItem;
import com.musicstore.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);

    }

    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);

    }

    public void rmoveAllCartItems(Cart cart) {
        cartItemDao.removeAllCartItems(cart);

    }

    public CartItem getCartItemByProductId(int productId) {
        return cartItemDao.getCartItemByProductId(productId);
    }
}
