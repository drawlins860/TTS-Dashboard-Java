package com.dylanapp.ttscapstone.repositories;

import com.dylanapp.ttscapstone.model.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
@Transactional
public interface ProductRepository extends JpaRepository<Product,Integer> {


    @Query(value= "SELECT * FROM products u WHERE  u.category = :category", nativeQuery = true)
    List<Product> findByCategory(@Param("category") Integer category);


    @Query(value="SELECT * FROM products u WHERE  u.availability= 1 and u.category = :category ", nativeQuery = true)
    List<Product> findByCategoryAndInstock(@Param("category") Integer category);

    @Query(value="SELECT * FROM products u WHERE  u.availability= 0 and u.category = :category ", nativeQuery = true)
    List<Product> findByCategoryAndOutstock(@Param("category") Integer category);

    @Query(
            value = "SELECT * FROM `products` ORDER BY `fullPrice` DESC;",
            nativeQuery = true)
     List<Product> findByFullPriceOrderDesc();

    @Query(
            value = "SELECT * FROM `products` ORDER BY `fullPrice` ASC;",
            nativeQuery = true)
     List<Product> findByFullPriceOrderAsc();

    @Query(
            value = "SELECT * FROM `products` ORDER BY `salePrice` DESC;",
            nativeQuery = true)
     List<Product> findBySalePriceOrderDesc();


    @Query(
            value = "SELECT * FROM `products` ORDER BY `salePrice` ASC;",
            nativeQuery = true)
     List<Product> findBySalePriceOrderAsc();
}

