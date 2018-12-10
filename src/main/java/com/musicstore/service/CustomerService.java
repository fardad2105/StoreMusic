package com.musicstore.service;

import com.musicstore.model.Customer;

import java.util.List;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
public interface CustomerService {

    void addCustomer (Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomer();

    Customer getCustomerByUsername(String username);

}
