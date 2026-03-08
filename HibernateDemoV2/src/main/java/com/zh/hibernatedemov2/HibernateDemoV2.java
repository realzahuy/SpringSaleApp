/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.zh.hibernatedemov2;

import com.zh.repositories.impl.CategoryRepositoryImpl;
import com.zh.repositories.impl.ProductRepositoryImpl;
import com.zh.repositories.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class HibernateDemoV2 {

    public static void main(String[] args) {
        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
        s.getCates().forEach(c -> System.out.println(c.getName()));
        
        Map<String, String> params = new HashMap<>();
        params.put("kw", "i");
        params.put("page", "1");

        ProductRepositoryImpl s2 = new ProductRepositoryImpl();
        s2.getProducts(params).forEach(p -> System.out.printf("%d - %s - %d\n",
                p.getId(), p.getName(), p.getPrice()));
        
        StatsRepositoryImpl s3 = new StatsRepositoryImpl();
        s3.statsRevenueByProduct().forEach(o -> System.out.printf("%d - %s - %d\n", o[0], o[1],o[2]));
        
        s3.statsrevenueByTime("MONTH", 2020).forEach(o -> System.out.printf("%d - %d\n", o[0], o[1]));
        
        s3.statsrevenueByTime("QUARTER", 2020).forEach(o -> System.out.printf("%d - %d\n", o[0], o[1]));
    }
}
