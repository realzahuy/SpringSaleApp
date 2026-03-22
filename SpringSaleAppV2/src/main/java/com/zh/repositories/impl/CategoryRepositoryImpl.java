/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zh.repositories.impl;

import com.zh.pojo.Category;
import com.zh.repositories.CategoryRepository;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    @Autowired
    private LocalSessionFactoryBean factory;
    public List<Category> getCates() {
        Session session = this.factory.getObject().getCurrentSession();
        Query query = session.createQuery("FROM Category", Category.class);
        return query.getResultList();
    }
}
