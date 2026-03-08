/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zh.repositories.impl;

import com.zh.hibernatedemov2.HibernateUtils;
import com.zh.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class CategoryRepositoryImpl {
    public List<Category> getCates() {
        try (Session session = HibernateUtils.getFactory().openSession()) {
            Query query = session.createQuery("FROM Category", Category.class);
            return query.getResultList();
        }
    }
}
