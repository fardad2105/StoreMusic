package com.musicstore.controller.admin;

import com.musicstore.model.Customer;
import com.musicstore.model.product;
import com.musicstore.service.CustomerService;
import com.musicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
@Controller
@RequestMapping("/admin")
public class AdminHome {

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String adminPage()
    {
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model)
    {
        List<product> products= productService.getProductList();
        model.addAttribute("products",products);
        return "productInventory";
    }

    @RequestMapping("/customer")
    public String customerManagement(Model model)
    {
        List<Customer> customerList=customerService.getAllCustomer();
        model.addAttribute("customerList",customerList);
        return "customerManagement";
    }

}