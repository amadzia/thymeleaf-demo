package com.example.thymeleafdemo.services;

import com.example.thymeleafdemo.domain.Author;
import com.example.thymeleafdemo.domain.Product;
import com.example.thymeleafdemo.domain.ProductCategory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private Map<Integer, Product> productMap;

    public ProductServiceImpl() {
        loadProducts();
    }

    @Override
    public Product getProduct(Integer id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> listProducts() {

        return new ArrayList<>(productMap.values());
    }

    private void loadProducts() {

        Author jt=new Author();
        jt.setFirstName("John");
        jt.setLastName("Thompson");
        jt.setId(1);
        jt.setImage("instructor_jt.jpg");

        ProductCategory springIntroCat=new ProductCategory();
        springIntroCat.setId(1);
        springIntroCat.setCategory("Spring Introduction");

        ProductCategory springCoreCat=new ProductCategory();
        springCoreCat.setId(2);
        springCoreCat.setCategory("Spring Core");

        ProductCategory springBootCat=new ProductCategory();
        springBootCat.setId(3);
        springBootCat.setCategory("Spring Boot");

        ProductCategory thymeleafCat=new ProductCategory();
        thymeleafCat.setId(4);
        thymeleafCat.setCategory("Thymeleaf");

        ProductCategory geapCat = new ProductCategory();
        geapCat.setId(5);
        geapCat.setCategory("GEAP");

        productMap=new HashMap<>();

        Product springIntro=new Product();
        springIntro.setId(1);
        springIntro.setCourseName("Introduction to Spring");
        springIntro.setCourseSubtitle("Start learning Spring");
        springIntro.setAuthor(jt);
        springIntro.setCourseDescription("Lorem ipsum");
        springIntro.setPrice(new BigDecimal("0"));
        springIntro.setImageUrl("SpringIntroThumb.png");
        springIntro.getProductCategories().add(springIntroCat);
        springIntro.getProductCategories().add(springBootCat);
        productMap.put(1, springIntro);

        Product springCoreUltimate=new Product();
        springCoreUltimate.setId(2);
        springCoreUltimate.setCourseName("Spring Core Ultimate");
        springCoreUltimate.setCourseSubtitle("Ultimate Bundle of Spring Core");
        springCoreUltimate.setAuthor(jt);
        springCoreUltimate.setCourseDescription("Lorem Ipsum 2");
        springCoreUltimate.setPrice(new BigDecimal("147"));
        springCoreUltimate.setImageUrl("SpringCoreUltimateThumb.png");
        springCoreUltimate.getProductCategories().add(springCoreCat);
        springCoreUltimate.getProductCategories().add(springBootCat);
        productMap.put(2, springCoreUltimate);

        Product thymeleaf=new Product();
        thymeleaf.setId(3);
        thymeleaf.setCourseName("Thymeleaf");
        thymeleaf.setCourseSubtitle("Thymeleaf and Spring");
        thymeleaf.setAuthor(jt);
        thymeleaf.setCourseDescription("Lorem Ipsum 3");
        thymeleaf.setPrice(new BigDecimal("15"));
        thymeleaf.setImageUrl("ThymeleafThumb.png");
        thymeleaf.getProductCategories().add(thymeleafCat);
        productMap.put(3, thymeleaf);

        Product springCore= new Product();
        springCore.setId(4);
        springCore.setCourseName("Spring Core");
        springCore.setCourseSubtitle("Spring Core - mastering Spring");
        springCore.setAuthor(jt);
        springCore.setCourseDescription("Lorem Ipsum 4");
        springCore.setPrice(new BigDecimal("99"));
        springCore.setImageUrl("SpringCoreThumb.png");
        springCore.getProductCategories().add(springCoreCat);
        springCore.getProductCategories().add(springBootCat);
        productMap.put(4, springCore);

        Product springCoreAdv=new Product();
        springCoreAdv.setId(5);
        springCoreAdv.setCourseName("Spring Core Advanced");
        springCoreAdv.setCourseSubtitle("Advanced Spring Core");
        springCoreAdv.setAuthor(jt);
        springCoreAdv.setCourseDescription("Lorem Ipsum 5");
        springCoreAdv.setPrice(BigDecimal.valueOf(99));
        springCoreAdv.setImageUrl("SpringCoreAdvancedThumb.png");
        springCoreAdv.getProductCategories().add(springCoreCat);
        springCoreAdv.getProductCategories().add(springBootCat);
        productMap.put(5, springCoreAdv);

        Product springCoreDevOps = new Product();
        springCoreDevOps.setId(6);
        springCoreDevOps.setCourseName("Spring Core Dev-Ops");
        springCoreDevOps.setCourseSubtitle("Deploying Spring in the Enterprise and the Cloud");
        springCoreDevOps.setAuthor(jt);
        springCoreDevOps.setCourseDescription("Lorem Ipsum 6");
        springCoreDevOps.setPrice(BigDecimal.valueOf(15));
        springCoreDevOps.setImageUrl("SpringCoreDevOpsThumb.png");
        springCoreDevOps.getProductCategories().add(springCoreCat);
        springCoreDevOps.getProductCategories().add(springBootCat);
        productMap.put(6, springCoreDevOps);
    }
}
