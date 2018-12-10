package com.musicstore.dao.impl;

import com.musicstore.dao.productDao;
import com.musicstore.model.product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
@Repository
@Transactional
public class productDaoImpl implements productDao {

    @Autowired
    private SessionFactory sessionFactory;


    public void addProduct(product product) {

        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();

    }

    public void editProduct(product product) {

        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();

    }

    public product getProductById(int id) {
        Session session=sessionFactory.getCurrentSession();
        product product=(product) session.get(product.class,id);
        session.flush();
        return product;
    }

    public List<product> getProductList() {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from product");
        List<product> products=query.list();
        session.flush();
        return products;
    }

    public void deleteProduct(product product) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(product);
        session.flush();
    }
}
