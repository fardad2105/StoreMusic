package com.musicstore.dao;

import com.musicstore.model.product;

import java.util.List;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
public interface productDao {

    List<product> getProductList();

    product getProductById(int id);

    void addProduct(product product);

    void editProduct(product product);

    void deleteProduct(product product);


}
