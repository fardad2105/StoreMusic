package com.musicstore.dao;

import com.musicstore.model.CustomerOrder;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
public interface CustomerOrderDao {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
