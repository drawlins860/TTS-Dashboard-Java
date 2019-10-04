package com.dylanapp.ttscapstone.controller;

import com.dylanapp.ttscapstone.model.Category;
import com.dylanapp.ttscapstone.model.Product;
import com.dylanapp.ttscapstone.model.Supplier;
import com.dylanapp.ttscapstone.repositories.CategoryRepository;
import com.dylanapp.ttscapstone.repositories.ProductRepository;
import com.dylanapp.ttscapstone.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

@Autowired
ProductRepository productrepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    SupplierRepository supplierRepository;

//Sorting
//By full price mapping
@GetMapping("/product/price/up")
public List<Product> findByOrderByFullPriceDesc(){
    System.out.println("test");
    return productrepository.findByFullPriceOrderDesc();
};

    @GetMapping("/product/price/down")
    public List<Product> findByOrderByFullPriceAsc(){
        return productrepository.findByFullPriceOrderAsc();
    };

    //By sale price mapping
    @GetMapping("/product/sale/up")
    public List<Product> findByOrderBySalePriceDesc(){
        return productrepository.findBySalePriceOrderDesc();
    };

    @GetMapping("/product/sale/down")
    public List<Product> findByOrderBySalePriceAsc(){
        return productrepository.findBySalePriceOrderAsc();
    };


    @GetMapping("/all")
    public List<Product> getAllGreetings() {
        return productrepository.findAll();


    }

    @GetMapping("/category/all")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }


    @GetMapping("/supplier/all")
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

//    @GetMapping("/products/{id}")
//    public Product getProductById(@PathVariable(value="id") Long id) {
//        Product productToReturn = new Product(); //not the correct way
//        List<Product> tempProducts = new ArrayList<>();
//        Product tempProduct = new Product(1, "Item 1");
//        tempProducts.add(tempProduct);
//        Product tempProduct2 = new Product(1, "Item 2");
//        tempProducts.add(tempProduct2);
//        Product tempProduct3 = new Product(1, "Item 3");
//        tempProducts.add(tempProduct3);
//        Product tempProduct4 = new Product(1, "Item 4");
//        tempProducts.add(tempProduct4);
//        Product tempProduct5 = new Product(1, "Item 5");
//        tempProducts.add(tempProduct5);
//
//        for (Product product : tempProducts) {
//            if (product.getId() == id) {
//                productToReturn = product;
//            }
//        }
//        return productToReturn;
//    }
//
//    @DeleteMapping("/{id}")
//    public List<Product> deleteProductByID(@PathVariable(value="id") Long id) {
//        List<Product> tempProducts = new ArrayList<>();
//        Product tempProduct = new Product(1, "Item 1");
//        tempProducts.add(tempProduct);
//        Product tempProduct2 = new Product(2, "Item 2");
//        tempProducts.add(tempProduct2);
//        Product tempProduct3 = new Product(3, "Item 3");
//        tempProducts.add(tempProduct3);
//        Product tempProduct4 = new Product(4, "Item 4");
//        tempProducts.add(tempProduct4);
//        Product tempProduct5 = new Product(5, "Item 5");
//        tempProducts.add(tempProduct5);
//
//        for (Product product : tempProducts) {
//            if (product.getId() == id) {
//                tempProducts.remove(product);
//            }
//        }
//        return tempProducts;
}


