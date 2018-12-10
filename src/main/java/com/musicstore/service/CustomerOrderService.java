package com.musicstore.service;

import com.musicstore.model.CustomerOrder;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
