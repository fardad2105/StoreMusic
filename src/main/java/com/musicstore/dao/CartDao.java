package com.musicstore.dao;

import com.musicstore.model.Cart;

import java.io.IOException;

/**
 * Created by fardadyadegari on 12/7/2018.
 */

public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);

}
