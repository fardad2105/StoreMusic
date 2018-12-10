package com.musicstore.service.impl;

import com.musicstore.dao.CustomerOrderDao;
import com.musicstore.model.Cart;
import com.musicstore.model.CartItem;
import com.musicstore.model.CustomerOrder;
import com.musicstore.service.CartService;
import com.musicstore.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);

    }

    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart=cartService.getCartById(cartId);
        List<CartItem> cartItems=cart.getCartItems();

        for (CartItem item:cartItems)
        {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }
}
