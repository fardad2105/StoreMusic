package com.musicstore.service.impl;

import com.musicstore.dao.productDao;
import com.musicstore.model.product;
import com.musicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private productDao productDao;
    public List<product> getProductList() {
        return productDao.getProductList();
    }

    public product getProductById(int productId) {

        return productDao.getProductById(productId);
    }

    public void addProduct(product product) {
        productDao.addProduct(product);

    }

    public void editProduct(product product) {
        productDao.editProduct(product);

    }

    public void deleteProduct(product product) {
        productDao.deleteProduct(product);

    }
}
