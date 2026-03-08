/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zh.repositories.impl;

import com.zh.hibernatedemov2.HibernateUtils;
import com.zh.pojo.User;
import jakarta.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class UserRepositoryImpl {
    public User getUserByUsername(String username) {
        try(Session s = HibernateUtils.getFactory().openSession()) {
            Query query = s.createNamedQuery("User.findByUsername", User.class);
            query.setParameter("username", username);
            
            return (User) query.getSingleResult();
        }
    }
}
