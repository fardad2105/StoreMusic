package com.musicstore.service.impl;

import com.musicstore.dao.CartDao;
import com.musicstore.model.Cart;
import com.musicstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart) {

        cartDao.update(cart);

    }
}
