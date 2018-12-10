package com.musicstore.controller;

import com.musicstore.model.product;
import com.musicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/productList")
    public String getProduct(Model model)
    {
        List<product> products= productService.getProductList();
        model.addAttribute("products",products);
        return "productList";
    }

    @RequestMapping("viewProduct/{productId}")
    public String viewProduct(@PathVariable int productId,Model model) throws IOException
    {
        product product=productService.getProductById(productId);
        model.addAttribute("product",product);

        return "viewProduct";
    }
}

