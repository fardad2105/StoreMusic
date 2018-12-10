package com.musicstore.dao.impl;

import com.musicstore.dao.CartItemDao;
import com.musicstore.model.Cart;
import com.musicstore.model.CartItem;
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
public class CartItemDaoImpl implements CartItemDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void addCartItem(CartItem cartItem) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(cartItem);
        session.flush();

    }

    public void removeCartItem(CartItem cartItem) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(cartItem);
        session.flush();

    }

    public void removeAllCartItems(Cart cart) {
        List<CartItem> cartItems=cart.getCartItems();

        for (CartItem item:cartItems)
        {
            removeCartItem(item);
        }

    }

    public CartItem getCartItemByProductId(int productId) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from CartItem where productId=?");
        query.setInteger(0,productId);
        session.flush();

        return (CartItem) query.uniqueResult();
    }
}
